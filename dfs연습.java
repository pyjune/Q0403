import java.util.Scanner;

/*
5 6
1 2 1 3 3 2 3 4 2 5 5 4
 */
public class Solution {
	static int V;
	static int E;
	static int [][]adj;
	static int [] visited;
	static int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		adj = new int [V+1][V+1];
		visited = new int [V+1];
		cnt=0;
		for(int i = 0; i<E; i++)
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			adj[n1][n2] = 1;
			//adj[n2][n1] = 1; // 무향인 경우
		}
		//dfs(1);
		dfs2(1, 4);
		System.out.println(cnt);
		
	}
	public static void dfs(int n)
	{
		visited[n] = 1;
		System.out.print(n+" ");
		for(int i = 1; i<=V; i++)
		{
			if(adj[n][i]==1 && visited[i]==0)
			{
				dfs(i);
			}
		}
	}
	public static void dfs2(int n, int k)
	{
		if(n==k)
		{
			cnt++;
		}
		else
		{
			visited[n] = 1;
			//System.out.print(n+" ");
			for(int i = 1; i<=V; i++)
			{
				if(adj[n][i]==1 && visited[i]==0)
				{
					dfs2(i, k);
				}
			}
			visited[n] = 0;
		}
	}
}
