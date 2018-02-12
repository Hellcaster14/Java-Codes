//Employee class
class Exp4_5_1
{
	String name,empid;
	int salary;
	Exp4_5_1()
	{
		name="";
		empid="";
		salary=0;
	}
	Exp4_5_1(String x,String y,int z)
	{
		name=x;
		empid=y;
		salary=z;
	}
	String Return_Name()
	{
		return name;
	}
	int Salary()
	{
		return salary;
	}
	void increaseSalary(double x)
	{
		salary+=(salary*x)/100;
		System.out.println("Salary increased by "+x+"%");
	}
}