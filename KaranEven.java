import java.util.*;
class KaranEven
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[];
		int n;
		System.out.println("Enter size:");
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even:"+arr[i]);
			}
			else
			{
				System.out.println("odd no:"+arr[i]);
			
			}
		}
	}
}
		