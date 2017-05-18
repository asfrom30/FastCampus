package com.doyoon.java.week2.oopbbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.doyoon.java.week2.oopbbs.model.Bbs;
import com.doyoon.java.week2.oopbbs.model.BbsLoader;
import com.doyoon.java.week2.oopbbs.view.BbsDetail;
import com.doyoon.java.week2.oopbbs.view.BbsInput;
import com.doyoon.java.week2.oopbbs.view.BbsList;

public class BbsPresenter {
	/* 보편적 방법 */
	final boolean START = true;	// 상수로 정의 해놓고 사용
	final boolean FINISH = false;
	boolean runFlag = START;
	
	// true를 상수로 바꾸어준다. 명확하게
	//	boolean runFlag = true;
	
	// 상수일때는 모두 대문자
//	final boolean RUN_FLAG = true;
	
	
	/* Private Instance Variable */
	private Scanner scanner;
	private BbsInput input;
	private BbsList bbsList;
	private ArrayList<Bbs>  datas;// 데이터 임시 저장소
	private BbsDetail bbsDetail;
	private BbsLoader bbsLoader;
	private long number = 0; // 글 번호의 개수
	
	public BbsPresenter() {
		init();
	}
	
	/*
	 * 초기화 함수
	 */
	private void init(){	// abstract를 선언한다.
		scanner = new Scanner(System.in);
		input = new BbsInput();	// 좋지 못한 습관, new를 자주 쓰면 안된다,지금은 연습
		datas = new ArrayList<>();
		bbsList = new BbsList();
		bbsDetail = new BbsDetail();
		bbsLoader = new BbsLoader();
	}
	
	public void start(){
		
		// while 같은데서 new를 쓰는것은 좋지 못한 것,
		// 목록에 데이터를 하는경우에는 new를 쓰는 경우가 나오긴 한다.
		while(runFlag){
			System.out.println("명령어를 입력하세요 [l:목록, w:쓰기, r:상세보기]");
			String command = scanner.nextLine();
			
			switch(command){
			case "l":
				datas = bbsLoader.read();
				bbsList.showList(datas);
				break;
			case "w":
				this.write();
				break;
			case "r":
				this.goDetail();
				break;
			}
		}
	}
	
	public void end(){
		runFlag = FINISH;
	}
	
	public void write(){
		Bbs bbs = input.process(scanner);
		
		//XXX
//		int number = datas.size() + 1; // 이렇게 하면 또 종속이 되어 버리는 구나... 이런식으로 코딩을 했었나??
										// 그래서 글번호를 저장하는 전역 변수를 선언한다.
									// 기준이 되는 값을 변수로 먼저 지정을 해야한다. 종속관계에 있는것이랑 똑같네... 변해버리니까.
									// 강한 커플링이 일어나지 않게 해라...
		number = bbsLoader.readCount();
		
		bbs.setId(number);
		bbs.setDate(this.getDate());
		
//		bbsLoader.wirte(1); //XXX 
		bbsLoader.write(bbs);
		datas.add(bbs);
	}
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long currentTime = System.currentTimeMillis();
		return sdf.format(currentTime);
	}
	
	// 상세보기 이동
	public void goDetail(){
		System.out.println("글번호를 입력하세요");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		
		for(Bbs bbs : datas){
			if(bbs.getId() == id){
//				bbsDetail.showDetail(bbs);
				
				bbsDetail.showId(bbs.getId());
				bbsDetail.showTitle(bbs.getTitle());
				bbsDetail.showAuthor(bbs.getAuthor());
				bbsDetail.showContent(bbs.getContent());
				bbsDetail.showDate(bbs.getDate());
				
				break;
			}
		}
	}
}
