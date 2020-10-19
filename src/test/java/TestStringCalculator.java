import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.junit.Assert;
import org.junit.Test;

public class TestStringCalculator {
	
	static StringCalculator obj=new StringCalculator();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TestStringCalculator ts=new TestStringCalculator();
		//ts.AddStringNumber1();
	}
	
	@Test
	public  void AddStringNumber1_0()
	{
		String numbers="";
		int cal=obj.Add(numbers);
		Assert.assertEquals(0,cal);
	}
	@Test
	public  void AddStringNumber1_1()
	{
		String numbers="1";
		int cal=obj.Add(numbers);
		Assert.assertEquals(1,cal);
		
	}
	@Test
	public  void AddStringNumber1_2()
	{
		String numbers="1,2";
		int cal=obj.Add(numbers);
		Assert.assertEquals(3,cal);
	}

}
