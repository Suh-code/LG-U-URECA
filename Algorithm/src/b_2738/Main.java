package b_2738;
// https://www.acmicpc.net/problem/2738 브3 행렬덧셈
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] aarr = new int[N][M];
		int[][] barr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				aarr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				barr[i][j]=sc.nextInt();
			}
		}//입력완료
		
		int[][] sum = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				sum[i][j]=aarr[i][j]+barr[i][j];
				System.out.print(sum[i][j]+" ");					
				if(j==M-1) {
					System.out.println();
				}
			}
		}
	}
}