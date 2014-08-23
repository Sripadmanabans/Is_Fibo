package is_fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class IsFibo 
{
	public static HashMap<Double, Integer> map = new HashMap<Double, Integer>();
	public static void fibo(double n[], double max)
	{
		double a = 0, b = 1, c = 0;
		map.put(a, 1);
		map.put(b, 1);
		while(c <= max)
		{
			c = a + b;
			map.put(c, 1);
			a = b;
			b = c;
		}
		for(int i = 0; i < n.length; i++)
		{
			if(map.containsKey(n[i]))
			{
				System.out.println("IsFibo");
			}
			else
			{
				System.out.println("IsNotFibo");
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		double n[] = new double[t];
		double temp, max = -1;
		for(int i = 0; i < t; i++)
		{
			temp = Double.parseDouble(br.readLine());
			if(temp > max)
			{
				max = temp;
			}
			n[i] = temp;
		}
		fibo(n, max);
	}
}
