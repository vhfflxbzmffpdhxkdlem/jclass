package com.java.www.service;

import java.util.ArrayList;

public class MServiceMember implements MService {
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		MemberDto mdao = new MemberDto();
		mdao.mList();
		list = mdao.mList();
		for(MemberDto mdto : list) {
			System.out.println("-------------------------------------");
			System.out.println("아이디 : "+mdto.getid());
			System.out.println("패스워드 : "+mdto.getps());
			System.out.println("이름 : "+mdto.getname());
			System.out.println("전화번호 : "+mdto.gettel());
			System.out.println("성별 : "+mdto.getgender());
			System.out.println("취미 : "+mdto.gethobby());
		}
		request.setAttribute("list", list);
	}
}
