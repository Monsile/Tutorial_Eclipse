package Study13_Login;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean check = false; // local variable = 초기화 필요
		String name=null ;
		int kor=0;
		int eng=0;
		int math=0;
		int sum=0;
		double avg = 0.0;
		int db_ID = 1111;
		int db_Pw= 0000;
		
		//로그인 설정
		
		for(int i=0; i<5; i++) {
			System.out.println("ID를 입력하세요!");
			int uId = sc.nextInt();
			System.out.println("PW를 입력하세요!");
			int uPw = sc.nextInt();
		
				if(uId==uId && uPw==db_Pw) {
				System.out.println("로그인 성공");
				i=5;//반복문 탈출
				check = !check; //true로 만들어서 밑으로 가게 하는거지... ㄷㄷ 생각도 몬했네
				
				}	
		}
		
		
	
		
		
		
		while (check) {
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 총점 출력");
			System.out.println("3. 학생 평균 출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력");
				name=sc.next();
				System.out.println("국어입력");
				kor = sc.nextInt();
				System.out.println("영어입력");
				eng = sc.nextInt();
				System.out.println("수학입력");
				math = sc.nextInt();
						
			} else if (select == 2) {
				
				 sum = kor+eng+math;
				 System.out.println(name+ "의 총점: "+ sum);
			} else if (select == 3) {
				
				 avg = (double)sum/3.0;
				 
				 System.out.println(name+ "의 평균: "+ avg);
				
				

			} else if (select == 4) {

				System.out.println("시스템 종료");
				break;
			}


		}

	}
}
