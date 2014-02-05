package datediff;

public class DataUtils {
	public double Calc(MyDate date1, MyDate date2) {
		int i = 0;
		double value = 0;
		double day1 = date1.dd;
		int month1 = date1.mm;
		double year1 = date1.yyyy;
		double day2 = date2.dd;
		int month2 = date2.mm;
		double year2 = date2.yyyy;
		double array1[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		double array2[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		
		
		// days are different
		 if (year1 == year2 && month1 == month2) 
		{
			return day2 - day1;

		}
		// months and days are different
		else if (year1 == year2) 
		{
			int end = month2;
			int start = month1;
			double value1=array2[start]-day1;
			for (i = start+1; i <=end; i++) 
			{
				value += array2[i];
			}
			for (i = start; i <end; i++) 
			{
				value += day2+value1;
				
			}
			return value;
		}
		// year is different
		else if (day1 == day2 && month1 == month2) 
		{
			double ydifference = year2 - year1;
			value += 365 * ydifference;
			return value;

		}
		// year and days are different
		else if (month1 == month2)
		{
			double ydifference = year2 - year1;
			value += day2 - day1 + (365 * ydifference);
			return value;

		}
		//days and year are same
		else if(day1==day2 && month1==month2)
		{int start=month1;
		int end=month2;
			for(i=start+1;i<=end;i++)
			{
			value+=array2[i];	
			}
			return value;
		}
		else
		return 0;
	}
}