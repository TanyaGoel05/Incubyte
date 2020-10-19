
public class StringCalculator {
	
	public int Add(String numbers)
	{
		String[] numbersarray=numbers.split(",");
		int sum;
		if(numbers.equals(""))
		{
			sum=0;
		}
		
		else if(numbersarray.length==1)
		{
			sum=Integer.parseInt(numbers);
		}
		
		else
		{
			sum=0;
			for(int i=0;i<numbersarray.length;i++)
			{
				sum+=Integer.parseInt(numbersarray[i]);
			}
			
			
		}
		
		return sum;
	}

}
