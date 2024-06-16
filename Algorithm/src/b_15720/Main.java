package b_15720;
//https://www.acmicpc.net/problem/15720 실5 카우버거
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int[] bcost = new int[b];
		int[] ccost = new int[c];
		int[] dcost = new int[d];
		
		for (int i = 0; i < b; i++) {
			bcost[i] = sc.nextInt();
		}
		for (int i = 0; i < c; i++) {
			ccost[i] = sc.nextInt();
		}
		for (int i = 0; i < d; i++) {
			dcost[i] = sc.nextInt();
		} // 입력완료
		
	
		
	}
}
