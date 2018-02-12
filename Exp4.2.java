import java.util.*;
class Exp4_2_1
{
	String name;
	int age;
	Exp4_2_1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and age");
		name=sc.nextLine();
		age=sc.nextInt();
	}
}
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
	
		System.out.println("Name of the Cricket player is "+name+" Centuries are "+centuries+" Age is "+age);
	}
}
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
	
		System.out.println("Name of the Football player is "+name+" Goals are "+goals+" Age is "+age);
	}
}
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
	
		System.out.println("Name of the Hockey player is "+name+" Scores are "+scores+" Age is "+age);
	}
}
class Exp4_2_5
{
	public static void main(String args[])
	{
		Exp4_2_2 obj=new Exp4_2_2();
		obj.display();
		Exp4_2_3 obj2=new Exp4_2_3();
		obj2.display();
		Exp4_2_4 obj3=new Exp4_2_4();
		obj3.display();
	}
}
		