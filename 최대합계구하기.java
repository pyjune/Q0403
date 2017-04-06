import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] map;
	static int [][] d;
	static int N; 
	static int M;

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N+1][M+1];
			d = new int[N+1][M+1];
			for(int i = 1; i<=N; i++)
			{
				for(int j=1;j<=M; j++)
				{
					map[i][j] = sc.nextInt();
				}
			}
			find();
			System.out.println("#"+tc+" "+d[N][M]);
		}
	}
	public static void find()
	{
		for(int i=1; i<=N; i++)
		{
			for(int j=1;j<=M; j++)
			{
				d[i][j] = (d[i-1][j]>d[i][j-1]?d[i-1][j]:d[i][j-1])+map[i][j];
			}
		}
	}
}
