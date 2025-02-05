package com.java.www;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.Authenticator.RequestorType;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

import com.java.www.service.BService;
import com.java.www.service.BServiceBList;
import com.java.www.service.MService;
import com.java.www.service.MServiceMember;

@WebServlet("*.do")
public class FController extends HttpServlet {

	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction호출");
		
		// 한글처리
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI(); 
		String cPath = request.getContextPath();
		String page = uri.substring(cPath.length());
		String url = "";
		BService bservice = null;
		MService mservice = null;
		
		
		if(page.equals("/index.do")) {
			System.out.println("메인페이지 연결");
			url="index.jsp";
		}else if(page.equals("/login.do")) {
			System.out.println("로그인페이지 연결");
			url="login.jsp";
		}else if(page.equals("/memberinput.do")) {
			System.out.println("회원가입페이지 연결");
			url="member.jsp";
		}else if(page.equals("/logout.do")) {
			System.out.println("로그아웃페이지 연결");
			url="logout.jsp";
		}else if(page.equals("/blist.do")) {
			System.out.println("게시판페이지 연결");
			// 전체게시글 가져오기
			bservice = new BServiceBList();
			bservice.excute(request, response); // request - list 데이터 담겨서 넘어옴.
			
			url="blist.jsp";
			
		}else if(page.equals("/member.do")) {
			System.out.println("회원전체정보페이지 연결");
			mservice = new MServiceMember();
			mservice.excute(request, response); // request - list 데이터 담겨서 넘어옴.
			url="member.jsp";
		}
		//url
		System.out.println("url : "+url);
//		response.sendRedirect(url); //
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet호출");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost호출");
		doAction(request, response);
	}

}
