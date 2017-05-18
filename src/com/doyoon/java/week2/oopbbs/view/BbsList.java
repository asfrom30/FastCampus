package com.doyoon.java.week2.oopbbs.view;

import java.util.ArrayList;

import com.doyoon.java.week2.oopbbs.model.Bbs;

public class BbsList {
	
	// 목록뿌리기
	public void showList(ArrayList<Bbs> datas){
		for(Bbs bbs : datas){
			System.out.print(bbs.getId()+" | ");
			System.out.print(bbs.getTitle()+" | ");
			System.out.print(bbs.getAuthor()+" | ");
			System.out.print(bbs.getDate()+" | ");
			System.out.println(bbs.getViewCount());
		}
	}
	
	// 상세보기 이동
	public void goDetail(ArrayList<Bbs> datas, long id){
		for(Bbs bbs : datas){
			if(bbs.getId() == id){
				BbsDetail detail = new BbsDetail();
				detail.showDetail(bbs);
				break;
			}
		}
	}
	
	
	// 쓰기 이동
	public void goInput(){
		
	}
	
	// 검색
	public void search(){
		
	}
	
	// 삭제
	public void delete(){
		
	}
}
