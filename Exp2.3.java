import java.util.*;
class Exp2_3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be printed");
		int n=sc.nextInt();
		int prev=0,curr=1,sum=0;
		System.out.print(prev+" "+curr+" ");
			for(int i=0;i<n;i++)
			{
				sum=prev+curr;
				prev=curr;
				curr=sum;
				System.out.print(curr+" ");
			}
	}
}
