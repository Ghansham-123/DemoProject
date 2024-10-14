package My_Program;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class Timepass {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<=4; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
