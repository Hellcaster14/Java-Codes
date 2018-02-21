import java.util.*;
class Exp2_9
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Enter number 1-12");
		x=sc.nextInt();
		switch(x)
		{
			case 1:System.out.println("Jan");
			break;
			case 2:System.out.println("Feb");
			break;
			case 3:System.out.println("Mar");
			break;
			case 4:System.out.println("Apr");
			break;
			case 5:System.out.println("May");
			break;
			case 6:System.out.println("June");
			break;
			case 7:System.out.println("July");
			break;
			case 8:System.out.println("Aug");
			break;
			case 9:System.out.println("Sep");
			break;
			case 10:System.out.println("Oct");
			break;
			case 11:System.out.println("Nov");
			break;
			case 12:System.out.println("Dec");
			break;
			default:System.out.println("Wrong choice");
		}
	}
}
