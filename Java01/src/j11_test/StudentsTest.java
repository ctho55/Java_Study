package j11_test;

import java.util.ArrayList;
import java.util.List;

public class StudentsTest {

	public static void main(String[] args) {

		Student stu1 = new Student("960232-1124535", "철수", 80, 78);
		stu1.infoPrint();
		Student stu2 = new Student("001232-4124535", "미아", 82, 76);
		stu2.infoPrint();
		Student stu3 = new Student("010232-3124535", "철왕", 50, 64);
		stu3.infoPrint();
		Student stu4 = new Student("940232-2124535", "영미", 88, 92);
		stu4.infoPrint();
		Student stu5 = new Student("020232-3124535", "민수", 79, 96);
		stu5.infoPrint();

		Student stuArr[] = new Student[] { stu1, stu2, stu3, stu4, stu5 };
	  
		stuArr[4].setsum(stuArr);
		stuArr[4].studentSort(stuArr);
		
		stuArr[4].studentSort02(stuArr);

	}

}


