package com.doyoon.java.week2.oopbbs.view;

import java.util.Scanner;

import com.doyoon.java.week2.oopbbs.model.Bbs;

public class BbsInput {
	
	public Bbs process(Scanner scanner){
		
		
		System.out.println("제목을 입력하세요.");
		String title = scanner.nextLine();
		System.out.println("작성자를 입력하세요.");
		String author = scanner.nextLine();
		System.out.println("내용을 입력하세요. 엔터를 두번치면 컨텐츠를 입력합니다.");
		String content = "";
		String beforeString = " ";
		while(true){
			String tempContent = scanner.nextLine();
			if(beforeString.equals("") && tempContent.equals("")){
				break;
			} else {
				beforeString = tempContent;
				content = content + tempContent + "\r\n";
			}
		}
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		return bbs;
	}
	
}
