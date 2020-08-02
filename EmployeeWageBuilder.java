class EmployeeWageBuilder
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final int empRatePerHrs=20;
	static final int numOfWorkingDays=20;
	static final int totalHrsInMonth=100;
	int empHrs=0;
	int empWage=0;
	int totalWage=0;
	int totalWorkingDay=0;
	int totalWorkingHrs=0;
  	
   public void wageComputation()
   {
   		empWage = empHrs * empRatePerHrs ;
			totalWage += empWage;
			totalWorkingHrs += empHrs;
			System.out.println("Employee's day "+ totalWorkingDay +" Wage is : " + empWage);
	}

  	public void empWage()
  	{
		while ( totalWorkingDay < numOfWorkingDays && totalWorkingHrs < totalHrsInMonth )
		{
			totalWorkingDay++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck)
			{
				case isFullTime :
					System.out.println("Employee is full time working");
					empHrs = 8;
					break;

				case isPartTime :
					System.out.println("Employee is part time working");
					empHrs = 4;
					break;

				default :
					System.out.println("Employee is Absent");
					empHrs = 0;
			}
			wageComputation();
		}
		
		System.out.println("Total working Hours in month : " + totalWorkingHrs);
   	System.out.println("Total Monthly wages is :" + totalWage);
   }


   public static void main(String arg[])
   {
      EmployeeWageBuilder wage = new EmployeeWageBuilder();
      wage.empWage();
   }
}
