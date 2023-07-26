import java.util.*;
public class PersonalInfor {
	Scanner sc=new Scanner(System.in);
	public String firstName,lastName,nationality,dob,email;
    public String state,city,pincode;
	public String mobno,marital;
	
	PersonalInfor()
	{
		System.out.println("ENTER PERSONAL DETAILS!!!!");
		System.out.println("-------------------------------");
		System.out.print("Enter first Name:");
		this.firstName=sc.next();
		System.out.print("Enter last Name:");
		this.lastName=sc.next();
		System.out.print("Enter your email:");
		this.email=sc.next();
		System.out.print("Enter your mobile number:");
		this.mobno=sc.next();
		System.out.print("Enter your Date of birth:");
		this.dob=sc.next();
		System.out.print("Enter your Nationality:");
		this.nationality=sc.next();		
		System.out.print("Enter marrital detail");
		this.marital=sc.next();
		System.out.println("ENTER YOUR ADDRESS");
		System.out.println("-------------------------------");
		System.out.print("Enter your state:");
		this.state=sc.next();
		System.out.print("Enter your city Name:");
		this.city=sc.next();
		System.out.print("Enter your pincode:");
		this.pincode=sc.next();
		
	}
	void PersonalDetailsShow() {
		System.out.println(firstName.toUpperCase()+" "+lastName.toUpperCase());
		System.out.println(email.toLowerCase());
		System.out.println(mobno);
		System.out.println("--------------------------------------------------");


	}


}
