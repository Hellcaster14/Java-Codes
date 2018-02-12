/*Consider the trunk calls of a telephone exchange. A trunk call can be ordinary,	
urgent or lightning. The charges depend on the duration and the type of the call. 
Write a program using the concept of polymorphism in Java to calculate the charges.*/
import java.util.Scanner;
class Exp4_4_1
{
	int duration;
	Exp4_4_1()
	{
		System.out.println("Enter duration of call");
		Scanner sc=new Scanner(System.in);
		duration=sc.nextInt();
	}
	void call_cost()
	{
	}	
}