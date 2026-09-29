import java.util.Scanner;

public class Code65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		for(int num = 1; num <= 9; num++) {
			for(int dan = 1; dan <= 9; dan++) {
				System.out.print(dan + "*" + num + "=" + dan*num + "\t");
			}
			System.out.println();
		}
		
        ---------------------------------------------------------------------------------
		
		System.out.print("2 이상의 정수를 입력하십시오: ");
		int num = sc.nextInt();
		
		boolean prime = true; // 맞냐 아니냐로 해야하기에 조건식을 설정 (기본값은 참)
		
		if(num < 2)
			prime = false;
		else {
			for(int i = 2; i < num; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
		}
		if (prime) {
			System.out.println(num + "은(는) 소수입니다");
		}else {
			System.out.println(num + "은(는) 소수가 아닙니다");
		}
		
        ---------------------------------------------------------------------------------
		
		int [] test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "번째 사람의 점수는" + test[i] + "입니다");	
		}
		
		
		int[] test = {80,60,22,50,75};
		
		for(int i=0; i<test.length; i++) {
			System.out.println((i+1) + "번째 자람의 점수는" + test[i] + "입니다");
		}
	
		System.out.println("시험의 응시자 수는" + test.length + "명입니다");
		
        --------------------------------------------------------------------------------- */
		
		int[] test = new int[5];
		System.out.println("5명의 점수를 입력하십시오");
		
		for(int i=0; i<test.length; i++) {
			test[i] = sc.nextInt();
		}
		
		for(int s=0; s<test.length-1; s++) {
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		
		for(int j = 0; j< test.length; j++){
			System.out.println((j + 1) + "번째 사람의 점수는" + test[j] + "입니다");
		}
		
		
	}
}
