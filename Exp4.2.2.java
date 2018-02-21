import java.util.Scanner;
class Exp4_2_2 extends Exp4_2_1
{
	int centuries;
	Exp4_2_2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Centuries");
		centuries=sc.nextInt();
	}
	void display()
	{
	
		System.out.println("Name of the player is "+name+" Centuries are "+centuries+" Age is "+age);
	}
}