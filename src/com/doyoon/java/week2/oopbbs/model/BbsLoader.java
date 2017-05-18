package com.doyoon.java.week2.oopbbs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.doyoon.java.week2.oopbbs.util.FileUtil;

public class BbsLoader {

	final String DATABASE_DIR = "c:/temp/mybbs/";
	final String DATABASE_NAME = "mybbs.db";
	final String COLUMN_SEPERATOR = "@@"; // 한칸 단위(^^가 특수문자라서 안된다. 특수문자는 구분자로
											// 사용할 수가 없다.)
	final String RECORD_SEPARATOR = "\n"; // 한줄 단위(윈도우 \r,\n)(
	final String DATABASE_COUNT = "mybbscount.db";

	/**
	 * 저장소에서 데이터를 읽어옴
	 * 
	 * @return (반환값에 대한 설명을 쓰세요)
	 */
	public ArrayList<Bbs> read() {
		ArrayList<Bbs> result = new ArrayList<>();

		File database = new File(DATABASE_DIR + DATABASE_NAME);
		if (database.exists()) {
			// 읽어서 줄단위로 Bbs에 저장하고
			// 완성된 Bbs를 result에 add 한다.
			try {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(database));
				String temp = "";

				while ((temp = bufferedReader.readLine()) != null) { // XXX 중요!!
																		// While문에서
																		// 변수를
																		// 담으면서
																		// 비교할 수
																		// 있다.
					String bbsTemp[] = temp.split(COLUMN_SEPERATOR);
					Bbs bbs = new Bbs();
					bbs.setId(Long.parseLong(bbsTemp[0]));
					bbs.setTitle(bbsTemp[1]);
					bbs.setAuthor(bbsTemp[2]);
					bbs.setContent(bbsTemp[3]);
					bbs.setDate(bbsTemp[4]);
					bbs.setViewCount(Integer.parseInt(bbsTemp[5]));
					result.add(bbs);
				}
			} catch (IOException e) { // Add 할때, 나누어서 추가 할 수 있다.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * 저장소에 데이터를 저장
	 * 
	 * @param value
	 *            (입력값에 대한 설명을 쓰세요)
	 */
	public void write(Bbs bbs) {

		FileUtil.makeDirectoryIfNotExists(DATABASE_DIR);
		File database = FileUtil.getFile(DATABASE_DIR + DATABASE_NAME);

		// 2. bbs에 내용을 파일에 저장을 한다.
		// 2.1저장하는 데이터의 구조를 설계한다.
		// 2.1.1 구분자를 저장한다.

		// 2.2 bbs의 내용을 횡으로 펼친다.
		String oneData = bbs.getId() + COLUMN_SEPERATOR + bbs.getTitle() + COLUMN_SEPERATOR + bbs.getAuthor()
				+ COLUMN_SEPERATOR + bbs.getContent() + COLUMN_SEPERATOR + bbs.getDate() + COLUMN_SEPERATOR
				+ bbs.getId() + RECORD_SEPARATOR;

		// 3. 횡으로 펼쳐진 데이터를 파일의 제일 마지막 줄에 저장한다.
		// 3,1 FileWriter 객체를 사용해서 기존 데이터 계속 더해쓴다.
		Path path = Paths.get(DATABASE_DIR, DATABASE_NAME);

		try {
			FileWriter fileWriter = new FileWriter(database, true);
			fileWriter.append(oneData);
			fileWriter.close(); // 반드시 close 해줘야 한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public long readCount() {
		long result = 0;

		FileUtil.makeDirectoryIfNotExists(DATABASE_DIR);
		File database = FileUtil.getFile(DATABASE_DIR + DATABASE_COUNT);

		FileReader fr;
		try {
			fr = new FileReader(database);	// 1. 읽기 위한 빨대 꼽기
			BufferedReader br = new BufferedReader(fr);	// 2. 굵은 빨대
			// 한줄만 읽어오기
			String number = br.readLine();
			// 여러줄 읽어오기
//			while ((s = br.readLine()) != null) {
//				System.out.println(s);
//			}
			
			// 아무것도 없으면..
			if(number == null){
				result = 1;
			} else {
				long tempNumber = Long.parseLong(number);
				result = tempNumber + 1;
			}
			
			// 다 읽었으면 닫아주어야 한다. 읽으려고 접근하면 blocking이 일어나기 때문에
			fr.close();
			
			// 데이터베이스에 최종 카운트를 저장한다.
			FileWriter fileWriter = new FileWriter(database);
			fileWriter.write(result + "");
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		

		

		return result;
	}

	/* 함수로 하나씩 빼두면 메인코드가 점점 줄어 든다. */

	/* 아래 함수들의 설계를 변경한다. */
	/*
	 * Bbs Loader에 makeDirectoryNoteixists(), getFile(), makeFile()이 bbsLoader에
	 * 있는게 적당하지 않다.
	 */
	/*
	 * 설계 변경 프로세스 : 위 함수에서 공통 해당 함수를 아래처럼 함수로 정의한다. -> 해당 함수들이 bbsloader에 적당하지
	 * 않으므로 유틸 패키지로 이동 -> -> 해당 함수들을 사용할때마다 new를 선언하는 것은 불필요하므로 static으로 선언
	 */
	// public void makeDirectoryIfNotExists(String path) {}
	// public void makeDirectoryIfNotExists() {}
	// public File getFile(String path) {}
	// public void makeFile(File database){}

}
