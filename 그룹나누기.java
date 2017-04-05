import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int []rep;
	static int N;
	static int M;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			rep = new int[N+1];
			for(int i=1; i<=N; i++)
				rep[i] = i;           // 처음에는 각자 그룹대표임
			for(int i=0; i<M; i++)
			{
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				rep[n2] = find_rep(n1); // n2의 대표값을 n1의 대표값으로 교체(같은 그룹임을 표시)
			}
			int cnt = 0;
			for(int i=1; i<=N; i++)
				if(rep[i]==i) // 대표원소의 수가 그룹의 수가 됨
					cnt++;
			System.out.println("#"+tc+" "+cnt);
		}
		
	}
	public static int find_rep(int n)
	{
		while(rep[n]!=n) // 자신이 대표가 아니면 대표를 찾아 반복..
		{
			n=rep[n];
		}
		return n;
	}

}
