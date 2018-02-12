import java.util.*;
class Exp2_8
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter 10 numbers");
		int sum=0;
		for (int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i]*a[i];
		}
		System.out.println("Sum = "+sum);
	}
}