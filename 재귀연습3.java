
public class Solution {
	static int []a={1,2,3,4,5};
	static int []l = new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3(0,3, 5);
	}
	public static void f3(int n, int k, int m)
	{
		if(n==k)
		{
			for(int i = 0; i<k; i++)
			{
					System.out.print(l[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i = 0; i<m; i++)
			{
				l[n] = a[i];
				f3(n+1, k, m);
			}
		}
	}
	public static void f2(int n, int k)
	{
		if(n==k)
		{
			for(int i = 0; i<k; i++)
			{
					System.out.print(l[i]);
			}
			System.out.println();
		}
		else
		{
			for(int i = 0; i<k; i++)
			{
				l[n] = a[i];
				f2(n+1, k);
			}
		}
	}
	public static void f(int n, int k)
	{
		if(n==k)
		{
			for(int i = 0; i<k; i++)
			{
				if(l[i]==1)
					System.out.print(a[i]);
			}
			System.out.println();
		}
		else
		{
			l[n] = 0;
			f(n+1, k);
			l[n] = 1;
			f(n+1, k);
		}
	}
}
