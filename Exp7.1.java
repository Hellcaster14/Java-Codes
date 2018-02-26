import java.util.*;
import java.lang.*;
class Exp7_1
{
	public static void main(String args[])
	{
		int Student_Roll[] = new int[10];
		String Student_Name[]= new String[10];
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int i=0;
		while(true)
		{
			try
			{
				
				System.out.println("Enter roll number and name");
				Student_Roll[i]=sc.nextInt();
				Student_Name[i]=sc1.nextLine();
				i++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception occured "+e);
				break;
			}
		}
	}
}
		
		