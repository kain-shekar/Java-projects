import java.util.Scanner;

	public class Qualification {
		Scanner sc = new Scanner(System.in);
	public String degree;
	public String clgName;
	public float per;
	
	
	public void Education() throws Exception
	{
	
		System.out.print("Enter your college name :");
		clgName=sc.next();
		System.out.print("Enter your Qualification:");
		degree=sc.next();
		System.out.print("Enter your percentage:");
		per=sc.nextFloat();
	}
	}


