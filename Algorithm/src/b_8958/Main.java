package b_8958;
//https://www.acmicpc.net/problem/8958 브2 OX퀴즈
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] testCase = new String[n];
		
		for (int i = 0; i < n; i++) {
			testCase[i]=sc.next();
		} // 입력완료

		for (int i = 0; i < n; i++) {
			int count = 0; // 각 줄마다 다른 sum값을 도출하기 위해 for문안에 count랑 sum값 모두 0으로 초기화
			int sum= 0;
			for (int j = 0; j < testCase[i].length(); j++) {
				if(testCase[i].charAt(j)=='O') { // O 라면 count ++, j인수 for문을 다 수행할 때 까지 sum값에 count함수 더해서 저장 
					count ++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}