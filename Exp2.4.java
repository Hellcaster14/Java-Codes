class Exp2_4
{
	public static void main(String args[])
	{
		switch(args[1])
		{
		case "+":System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[2]));
				break;
		case "-":System.out.println(Integer.parseInt(args[0])-Integer.parseInt(args[2]));
				break;
		case "*":System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[2]));
				break;
		case "/":System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[2]));
				break;
		default:System.out.println("Wrong Choice");
		}
	}
}
