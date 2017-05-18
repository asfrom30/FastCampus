package com.doyoon.java.week2.oopbbs.util;

import java.io.File;
import java.io.IOException;


/* 유틸성 함수들은 대부분 public으로 설계가 된다. */

public class FileUtil {
	
	/* 유틸성에 파일클래스는 언제 어디서든지 가져다가 쓸수 있으므로 메모리에 올려둔다. static으로 선언하면 다른 클래스에서 new를 선언할 필요가 없다. */
	/* File Util*/
	// 애플(스위프트) 함수명 스타일의 네이밍...
	public static void makeDirectoryIfNotExists(String path) { // 코드를 치면서 설계가 바뀌는 경우는 아주 많다. 네이밍이
		// bbs에 있는 데이터를 텍스트 파일에 저장한다.
		// 1. 디렉터리가 있는지 검사 및 생성
		File dir = new File(path);
		if (!dir.exists()) {
			dir.mkdirs(); // dir은 경로에 있는 폴더만 생성, dirs는 경로상에 있는 모든 폴더를 검사하여 없으면
							// 생성
		}
	}
		
	// 자바 진영 함수명 약어를 쓴다.
	public static File getFile(String path) {
		// 1.2 파일이 있는지 검사하고텍스트 파일 있는지 검사
		File database = new File(path);

		// 1.1 없으면 생성
		if (!database.exists()) {
			makeFile(database);
		}
		
		return database;
	}
	
	// 함수가 네이밍의 의미하는 기능만 하도록 한다.(makeDir은 딱 디렉터리만 만드는 것)
	// 객체 지향처럼, 함수 하나하나도 그 의미가 나타내는 기능만 동작하도록 구현을 해야한다.
	public static void makeFile(File database){
		try {
			database.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
