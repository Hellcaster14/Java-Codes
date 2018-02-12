import java.util.*;
class Exp2_6
{
		public static void main(String args[])
		{
				Scanner sc=new Scanner(System.in);
				int arr[]=new int[10];
				System.out.println("Enter 10 marks");
				for(int i=0;i<10;i++)
					arr[i]=sc.nextInt();
				Arrays.sort(arr);
				System.out.println("Marks \t Grade ");
				for(int i=0;i<10;i++)
				{
						if(40<=arr[i] && arr[i]<=50)
							System.out.println(arr[i]+"\t Pass");
						else if(51<=arr[i] && arr[i]<=75)
							System.out.println(arr[i]+"\t Merit");
						else if(75<arr[i])
							System.out.println(arr[i]+"\t Distinction");
						else
							System.out.println(arr[i]+"\t Fail");
				}
		}
}
						