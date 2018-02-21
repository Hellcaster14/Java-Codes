import java.util.Scanner;
class Exp4_2_3 extends Exp4_2_1
{
	int goals;
	Exp4_2_3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Goals");
		goals=sc.nextInt();
	}
	void display()
	{
	
		System.out.println("Name of the player is "+name+" Goals are "+goals+" Age is "+age);
	}
}