import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class DriverCls {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		File file = new File("Resume.txt");
		//file.createNewFile();
		FileWriter fw=new FileWriter(file,true);
		PrintWriter pw=new PrintWriter(fw);
		//System.out.println(file.exists());
		//PersonalInfor pi = new PersonalInfor();
		Qualification qf[] =new Qualification[3];
	
			
	System.out.println("ENTER YOUR EDUCATION INFORMAION");
	System.out.println("Enter your recent completed Education Detials");
	qf[0].Education();
	System.out.println("Enter your InterMediate Education Details");
	qf[1].Education();
	System.out.println("Enter your ssc Education Details");
	qf[2].Education();
	
		
	



		
		
		
		
		
		System.out.println("\t\t\t   RESUME");
		System.out.println("\t\t\t-------------");
		//pi.PersonalDetailsShow();
		System.out.println("-------------------------------");
		System.out.println("QUALIFICATION DETAILS");
		System.out.println("-------------------------------");

		System.out.println("\t COLLEGE NAME\t\t\tQUALIFICATION\t\t\tPERCENTAGE");
		for(int i=0;i<=2;i++) {
		System.out.println(qf[i].clgName+qf[i].degree+qf[i].per);
		}
		System.out.println();
	
		
	pw.flush();	
	pw.close();
	sc.close();
	
	
	}

}
