import java.util.*;
class Exp4_3_1
{
	String name;
	int salary_rate;
	Exp4_3_1()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name and salary rate of the worker");
			name=sc.nextLine();
			salary_rate=sc.nextInt();
	}
	void Compay(int a)
	{
	}
}
class Exp4_3_2 extends Exp4_3_1
{
	
	void Compay(int a)
	{
		System.out.println("Salary of Daily Worker "+name+" "+a*salary_rate);
	}
}
class Exp4_3_3 extends Exp4_3_1
{
	void Compay(int a)
	{
		System.out.println("Salary of salaried Worker "+name+" "+40*salary_rate);
	}
}
class Exp4_3_4
{
	public static void main(String args[])
	{
		Exp4_3_1 w;
		w=new Exp4_3_2();
		w.Compay(6);
		w=new Exp4_3_3();
		w.Compay(55);
	}
}
