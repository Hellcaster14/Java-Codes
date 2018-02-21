import java.util.Scanner;
class Exp4_4_5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for normal call \n 2 for urgent call \n 3 for lightinging call");
		int ch=sc.nextInt();
		Exp4_4_1 obj;
		switch(ch)
		{
			case 1:
			obj=new Exp4_4_2();
			obj.call_cost();
			break;
			
			case 2:
			obj=new Exp4_4_3();
			obj.call_cost();
			break;
			
			case 3:
			obj=new Exp4_4_4();
			obj.call_cost();
			break;
			
			default: System.out.println("Wrong choice");
		}
	}
}