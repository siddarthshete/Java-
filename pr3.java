import java.util.Scanner;
import java.util.*;
class UserDefined extends Exception
{
	public UserDefined (String message)
	{
		super(message);
	}
}
class UserData
{ 
	private int age;
	private double amount;
	private String city;
	private boolean hasfourwheeler;
	public UserData(int age,double amount,String city,boolean hasfourwheeler)
	{
		this.age=age;
		this.amount=amount;
		this.city=city;
		this.hasfourwheeler=hasfourwheeler;
	}

	public void checkdata() throws UserDefined
	{
		if(age<18 || age>55)
		{
			throw new UserDefined("Age is Should be between 18-55 ");
		}
		if(amount<50000||amount>100000)
		{
			throw new UserDefined("Salary should be between 50k-100k ");
		}
		if(!(city.equalsIgnoreCase("Pune")||city.equalsIgnoreCase("Mumbai")||city.equalsIgnoreCase("Banglore")||city.equalsIgnoreCase("Channai")))
		{
			throw new UserDefined("City should be Pune,Mumbai,Banglore or Channai.");
		}
		if(hasfourwheeler==false)
		{
			throw new UserDefined("User should have four wheeler.");
		}
		System.out.println("Checking done...");
	}
}
class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Enter the age : ");
			int age = sc.nextInt();
			System.out.println("Enter the Salary : ");
			double amount = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the name of City (First Letter should be Capital ) : ");
			String city = sc.nextLine();
			System.out.println("Do you have four wheeler (if yes enter true else false ) : ");
			boolean hasfourwheeler = sc.nextBoolean();
			sc.nextLine();
            UserData obj = new UserData(age,amount,city,hasfourwheeler);
            obj.checkdata();
            System.out.println("Checking Done .... ");
		}
		catch(UserDefined e)
		{
			System.out.println("User Defined Exception : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("ERROR : "+e.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
}