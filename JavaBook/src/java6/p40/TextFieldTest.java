package java6.p40;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button logbtn1, logbtn2;
	private TextField id, pwd;
	private Label lid, lpwd;
	
	private String uid = "123";
	private String upwd = "456";
	
	public TextFieldTest() {
		f = new Frame("Login");
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		logbtn1 = new Button("로그인");
		logbtn2 = new Button("아이디와 비밀번호를 입력해주세요.");
		id = new TextField(10);
		pwd = new TextField(10);
	}
	public void startFrame() {
		f.setSize(500, 180);
		f.setLayout(null);
		f.addWindowListener(this);
		
		lid.setBounds(50, 60, 100, 10);
		lpwd.setBounds(50, 90, 100, 10);
		
		logbtn1.setBounds(400, 57, 50, 50);
		logbtn1.addActionListener(this);
		logbtn2.setBounds(70,115,300,50);
		
		id.setBounds(170, 57, 150, 20);
		pwd.setEchoChar('*');
		pwd.setBounds(170, 87, 150, 20);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(logbtn1);
		f.add(logbtn2);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		TextFieldTest t = new TextFieldTest();
		t.startFrame();
		
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("로그인")) {
			System.out.println("123");
			String id1 = id.getText();
			String pwd1 = pwd.getText();
			if(!id1.equals(uid)) {
				logbtn2.setLabel("아이디를 찾을 수 없습니다.");
			} else if (id1.endsWith(uid)&&!pwd1.equals(upwd)) {
				logbtn2.setLabel("비밀번호가 일치하지 않습니다.");
			} else if(id1.endsWith(uid)&&pwd1.equals(upwd)) {
				logbtn2.setLabel("로그인에 성공했습니다.");
			}
		}
	}

}
