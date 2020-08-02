class EmployeeWageBuilder
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final int empRatePerHrs=20;
	int empHrs=0;
	int empWage=0;

   double empCheck = Math.floor(Math.random()*10) % 3;

	public void empWage()
	{
		if (empCheck == isFullTime)
		{
			System.out.println("Employee is full time");
			empHrs=12;
		}
		else if (empCheck == isPartTime)
		{
			System.out.println("Employee is part time");
			empHrs=4;
		}
		else
		{
			System.out.println("Employee is Absent");
		}
		empWage = empHrs*empRatePerHrs;
		System.out.println("Employee wage : " + empWage);

	}
	public static void main(String arg[])
	{
		EmployeeWageBuilder wage = new EmployeeWageBuilder();
		wage.empWage();
	}
}
