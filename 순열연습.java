/* Text.txt
1
3 5
1 2 3 4 5
*/


import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int[] a;
	static int[] u;
	static int[] p;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Text.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++)
		{
			int k = sc.nextInt();
			int m = sc.nextInt();
			p = new int[k];
			a = new int[m];
			u = new int[m];
			for(int i = 0; i<m; i++)
				a[i] = sc.nextInt();
			
			System.out.print("#"+tc);
			f(0, k, m);
			
		}
	}
	public static void f(int n, int k, int m)
	{
		if(n==k)
		{
			System.out.print(" ");
			for(int i = 0; i<k; i++)
				System.out.print(p[i]);
			
		}
		else
		{
			for(int i = 0; i<m; i++)
			{
				if(u[i]==0)
				{
					u[i] = 1;
					p[n] = a[i];
					f(n+1, k , m);
					u[i] = 0;
				}
			}
		}
	}

}
