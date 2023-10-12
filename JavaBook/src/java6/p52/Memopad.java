package java6.p52;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Memopad {

	public static void main(String[] args) {
		Frame f = new Frame("메모장");
		f.setSize(500,300);
		
		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuItem miOpen1 = new MenuItem("새 창(W)");
		MenuItem miOpen2 = new MenuItem("열기(O)");
		MenuItem miSave1 = new MenuItem("저장(S)");
		MenuItem miSave2 = new MenuItem("다른 이름으로 저장(A)");
		MenuItem miPage = new MenuItem("페이지 설정(U)");
		MenuItem miPrint = new MenuItem("인쇄(P)");
		MenuItem miExit = new MenuItem("끝내기");
		
		mFile.add(miNew);
		mFile.add(miOpen1);
		mFile.add(miOpen2);
		mFile.add(miSave1);
		mFile.add(miSave2);
		mFile.addSeparator();
		mFile.add(miPage);
		mFile.add(miPrint);
		mFile.addSeparator();
		mFile.add(miExit);
		
		
		Menu mOthers = new Menu("편집(E)");
		MenuItem miOth1 = new MenuItem("실행 취소(U)");
		MenuItem miOth2 = new MenuItem("잘라내기(T)");
		MenuItem miOth3 = new MenuItem("복사(C)");
		MenuItem miOth4 = new MenuItem("붙여넣기(P)");
		MenuItem miOth5 = new MenuItem("삭제(L)");
		MenuItem miOth6 = new MenuItem("Bing으로 검색(S)...");
		MenuItem miOth7 = new MenuItem("찾기(F)...");
		MenuItem miOth8 = new MenuItem("다음 찾기(N)");
		MenuItem miOth9 = new MenuItem("이전 찾기(V)");
		MenuItem miOth10 = new MenuItem("바꾸기(R)");
		MenuItem miOth11 = new MenuItem("이동(G)");
		MenuItem miOth12 = new MenuItem("모두 선택(A)");
		MenuItem miOth13 = new MenuItem("시간/날짜(D)");
				
		mOthers.add(miOth1);
		mOthers.addSeparator();
		mOthers.add(miOth2);
		mOthers.add(miOth3);
		mOthers.add(miOth4);
		mOthers.add(miOth5);
		mOthers.addSeparator();
		mOthers.add(miOth6);
		mOthers.add(miOth7);
		mOthers.add(miOth8);
		mOthers.add(miOth9);
		mOthers.add(miOth10);
		mOthers.add(miOth11);
		mOthers.addSeparator();
		mOthers.add(miOth12);
		mOthers.add(miOth13);
		
		Menu mEdit = new Menu("서식(O)");
		MenuItem miEd1 = new MenuItem("자동 줄 바꿈(W)");
		MenuItem miEd2 = new MenuItem("글꼴(F)...");
		
		mEdit.add(miEd1);
		mEdit.add(miEd2);
		
		Menu mView = new Menu("보기(V)");
		Menu miVM1 = new Menu("확대하기/축소하기");
		MenuItem miVi1 = new MenuItem("확대(I)");
		MenuItem miVi2 = new MenuItem("축소(O)");
		MenuItem miVi3 = new MenuItem("확대하기/축소하기 기본값 복원");
		CheckboxMenuItem miVM2 = new CheckboxMenuItem("상태 표시줄(S)");
		
		mView.add(miVM1);
		mView.add(miVM2);
		miVM1.add(miVi1);
		miVM1.add(miVi2);
		miVM1.add(miVi3);
		
		Menu mHelp = new Menu("도움말(H)");
		MenuItem miH1 = new MenuItem("도움말 보기(H)");
		MenuItem miH2 = new MenuItem("피드백 보내기(F)");
		MenuItem miH3 = new MenuItem("메모장 정보(A)");
		
		mHelp.add(miH1);
		mHelp.add(miH2);
		mHelp.addSeparator();
		mHelp.add(miH3);
		
		
		mb.add(mFile);
		mb.add(mOthers);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		
		f.setMenuBar(mb);
		f.setVisible(true);

	}

}
