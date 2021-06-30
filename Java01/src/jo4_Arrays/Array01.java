package j04_array;

public class Array01 {

	public static void main(String[] args) {
		// 5명의 학생의 점수를 처리 한다고 가정
		int s1=10, s2=20, s3=30, s4=40, s5=50;
		int sum = s1 + s2 + s3 + s4 + s5;
		
		//** 배열 : 동일 성격 & 타입의 자료를 하나의 묶음으로 처리 
		// 장징 = 일괄처리
		// 특점 = 동일타입, 모든 자료형 가능
		// 방법 = 선언 후 사용 = 명시적선언, 묵시적 선언
		// 크기(length), 인덱스(0부터 length-1)
		
		
		// 1. 명시적 선언 ( new 연산자 이용)
		// => 크기를 반드시 지정 해야함.
		// 1번. int[] arr ; 형태로 정의하거나 
		// 2번. int arr [] ;
      //int[] score1 = new int[5] ;
    //(배열 참조 변수 선언) =  (배열객체 생성) 
		
		int[] score1;
		int l = 5;
		score1 = new int [l];
		double avg= 0 ;
		// write / read : index 이용
		score1[0] = 100;
		score1[1] = 200;
		score1[2] = 300;
		score1[3] = 400;
		score1[4] = 500;
		
		score1[3] += 50 ;
		score1[0] = score1[1] + score1[2];
		sum = score1[0] + score1[1] + score1[2] + score1[3] + score1[4];
		// => 일괄처리 (반복문적용)
		//    학생별, 점수출력,합계
		sum = 0 ;
		for(int i=0; i<score1.length ; i++) {
		 System.out.println("학생"+(i+1)+" = "+ score1[i]); 
		 sum += score1[i];
		}//for문
		 System.out.printf("합계 : %d  \n", sum);
		 
		 
	    // 2. 묵시적 선언 => 선언과 동시에 초기화 
		 int[] score2 = {22,33,44,55,66,77,88,99}; 
		 sum = 0;
		 // length:8 index : 0~7
		 for(int i= 0 ; i < score2.length ; i++) {
			 System.out.println("학생"+(i+1)+ score2[i]);
			 sum += score2[i];
		 }
		 avg = sum/score2.length;
		 System.out.printf("합계 : %d ,평균: %6.2f \n", sum, avg);
		 
		 //3. for each
		 // for each문 
		 // read만 가능 
		 
		 //for(대입받을 변수 : 배열명) 
		 
	}// main

}// class
