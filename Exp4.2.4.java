import java.util.Scanner;
class Exp4_2_4 extends Exp4_2_1
{
	int scores;
	Exp4_2_4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Scores");
		scores=sc.nextInt();
	}
	void display()
	{
	
		System.out.println("Name of the player is "+name+" Scores are "+scores+" Age is "+age);
	}
}