class Exp4_5_2 extends Exp4_5_1
{
	String department;
	public static void main(String args[])
	{
		Exp4_5_1 obj=new Exp4_5_1("Rajeev","500053661",5000);
		Exp4_5_1 obj2=new Exp4_5_1();
		System.out.println("Name of employee is "+obj.Return_Name());
		System.out.println("Salary of employee is "+obj.Salary());
		obj.increase_Salary(55.9);
		System.out.println("New salary of employee is "+obj.Salary());
		System.out.println("Name of employee is "+obj2.Return_Name());
		System.out.println("Salary of employee is "+obj2.Salary());
		obj2.increase_Salary(55.9);
		System.out.println("New salary of employee is "+obj2.Salary());
	}
}