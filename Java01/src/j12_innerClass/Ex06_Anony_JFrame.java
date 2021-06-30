package j12_innerClass;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

// ** 익명 클래스의 활용예
// => 이벤트 리스너를 이용하여 종료버튼 만들기

public class Ex06_Anony_JFrame extends JFrame {

	public static void main(String[] args) {
		// ** Ui 준비
		Ex06_Anony_JFrame ex06 = new Ex06_Anony_JFrame() ;
		Button btn = new Button("Stop");
		ex06.setSize(300, 300);
		ex06.add(btn);
		ex06.setVisible(true);
		
		// ** 1) 이벤트 리스너에 익명클래스 적용
//		ActionListener ac = new ActionListener()  {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// ** Button btn 에서 발생된 이벤트인지 확인후 종료
//				if (e.getActionCommand().equals("Stop")) System.exit(0);
//			} //actionPerformed 
//		}; // new
//		btn.addActionListener(ac);
		
		// ** 2) 매개변수 위치에 익명 클래스를 직접 작성
		// => 많이 사용 됨
		btn.addActionListener(
				new ActionListener()  {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (e.getActionCommand().equals("Stop")) System.exit(0);
					} //actionPerformed 
				}); // 매개변수끝에는 ; 필요없음
		
	} //main
} //class
