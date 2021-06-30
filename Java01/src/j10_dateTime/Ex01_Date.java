package j10_dateTime;


import java.text.SimpleDateFormat;
import java.util.Date;

// ** Date 
//=> 날짜 처리 클래스  
//=> 컴퓨터의 현재 날짜.시간를 읽어 Date 객체를 생성
//=> 비권장( 더이상 지원하지 않음 )  
// Deprecated :중요도가 떨어져 더 이상 사용되지 않고 앞으로는 사라지게 될 (컴퓨터 시스템 기능 등)

//** SimpleDateFormat
//=> Date Type 의 날짜 시간의 포맷을 잡아주는 클래스


public class Ex01_Date {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println("now =>"+ d);
		
		System.out.println(1900+d.getYear());
		System.out.println(d.getMonth()+1);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
		
		//SimpleDateFormat 사용
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sf now =>"+ sf.format(d));
		
		sf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("sf now =>"+ sf.format(d));

		sf = new SimpleDateFormat("yyyy:MM:dd a HH:mm:ss");
		System.out.println("sf now =>"+ sf.format(d));
		
		sf = new SimpleDateFormat("오늘은 E요일 입니다");
		System.out.println("sf now =>"+ sf.format(d));
		
		sf = new SimpleDateFormat("오늘은 올해의 D번째 날 입니다");
		System.out.println("sf now =>"+ sf.format(d));
		
		sf = new SimpleDateFormat("오늘은 이달의 d번째 날 입니다");
		System.out.println("sf now =>"+ sf.format(d));
	}

}
