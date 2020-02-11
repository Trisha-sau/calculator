import java.util.Scanner;
class cal
{	public static void main(String args[])
	{	Scanner ob=new Scanner(System.in);
		System.out.println("enter two number");
		double a=ob.nextDouble();
		double b=ob.nextDouble();
		System.out.println("\n1 for add \n2 for sub \n3 for mul \n4 for division");
		int x=ob.nextInt();
		double z=0;
		switch(x)
		{
			case 1:z=a+b;
				break;
			case 2:z=a-b;
				break;
			case 3: z=a*b;
				break;
			case 4: z=a/b;
				break;	
		}
		System.out.println("result is ="+z);
	}
} 