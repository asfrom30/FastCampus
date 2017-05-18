package com.doyoon.java.week2.oopbbs.view;

import com.doyoon.java.week2.oopbbs.model.Bbs;

public class BbsDetail {
	
	
	//XXX MVC 모델
	//여기서 bbs(model)을 직접 받기 때문에 이것은 MVC 모델이다.
	public void showDetail(Bbs bbs){
		System.out.println("글번호 " + bbs.getId());
		System.out.println("제목 " + bbs.getTitle());
		System.out.println("작성자 " + bbs.getAuthor());
		System.out.println("작성일자 " + bbs.getDate());
		System.out.println("조회수 " + bbs.getViewCount());
		System.out.println(bbs.getContent());
	}
	
	//XXX MVP 모델
	// param을 다 따로따로 받는다.
	public void showId(long id){
		System.out.println("글번호 " + id);
	}
	public void showTitle(String title){
		System.out.println("제목 " + title);
	}
	public void showAuthor(String author){
		System.out.println("작성자 " + author);
	}
	public void showDate(String date){
		System.out.println("작성일자 " + date);
	}
	public void showContent(String content){
		System.out.println(content);
	}
	public void showViewCount(int viewCount){
		System.out.println("조회수 " + viewCount);
	}
	public void endDetail(){
		System.out.println("============================");
	}
}
