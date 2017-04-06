import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] map;
	static int N; 
	static int M;
	static int min;

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N][M];
			for(int i = 0; i<N; i++)
			{
				for(int j=0;j<M; j++)
				{
					map[i][j] = sc.nextInt();
				}
			}
			min = Integer.MAX_VALUE;
			find(0, 0, 0);
			if(min==Integer.MAX_VALUE)
			{
				min = 0;
			}
			System.out.println("#"+tc+" "+min);
		}
	}
	public static void find(int r, int c, int s)
	{
		if(r==N-1 && c==M-1) // 도착
		{
			if(s+map[r][c]<min)
				min = s+map[r][c];
		}
		else
		{
			// 오른쪽
			if(c+1<M && map[r][c+1]!=0)
				find(r, c+1, s+map[r][c]);
			// 아래
			if(r+1<N && map[r+1][c]!=0)
				find(r+1, c, s+map[r][c]);
		}
	}
}
