import java.util.*;
class Exp2_7
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers Between 0 and 9");
		int a[]=new int[3];
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					if(i!=j && j!=k && i!=k)
					System.out.print(a[i]+""+a[j]+""+a[k]+"\t");
				}
			}
		}
	}
}