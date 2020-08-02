class EmployeeWageBuilder
{
	int isFullTime=1;
   double empCheck = Math.floor(Math.random()*10) % 2;

	public void emp_Present()
	{
		if (empCheck == isFullTime)
			System.out.println("Employee is Present");

		else
			System.out.println("Employee is Absent");
	}

	public static void main(String arg[])
	{
		EmployeeWageBuilder presentChk = new EmployeeWageBuilder();
		presentChk.emp_Present();
	}
}
