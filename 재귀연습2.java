
public class Solution {
	static int []a={1,5,7};
	static int []l = new int[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f2(0,3);
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
			for(int i = 0; i<3; i++)
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
