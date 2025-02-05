package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.BoardDto;

public class BoardDao {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	ArrayList<BoardDto> list;
	
	String btitle,bcontent,id;
	int bno,bgroup,bstep,bindent,bhit;

	// 전체게시글 가져오기 메소드
	public ArrayList<BoardDto> bList() {
		conn = getConnection();
		list = new ArrayList<BoardDto>();
		try {
			String sql = "select * from board"; 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				   bno = rs.getInt("bno");
				   btitle = rs.getString("btitle");
				   bcontent = rs.getString("bcontent");
				   id = rs.getString("id");
				   bgroup = rs.getInt("bgroup");
				   bstep = rs.getInt("bstep");
				   bindent = rs.getInt("bindent");
				   bhit = rs.getInt("bhit");
				   BoardDto b = new BoardDto(bno,btitle,bcontent,id,bgroup,bstep,bindent,bhit);
				   // 객체선언 BoardDto b = new BoardDto();
				   list.add(b);
			}
			

		} catch (Exception e) { e.printStackTrace();}
		finally{
		   try{
			  if(rs!=null) rs.close();
			  if(pstmt!=null) pstmt.close();
			  if(conn!=null) conn.close();
		   }catch(Exception e2){e2.printStackTrace();}
		}
		return list;
	} // bList
	
	
	// 커넥션 메소드
	public Connection getConnection() {
		Connection connection = null;
		try {
			// 커넥션풀에 있는 Connection객체 가져오기
			Context ctx = new InitialContext();
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			ds = (DataSource)envContext.lookup("jdbc/Oracle21");
			connection = ds.getConnection();	
		}catch(Exception e) {e.printStackTrace();}
		return connection;
	}
	
	
	
}
