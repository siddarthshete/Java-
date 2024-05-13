import java.util.Scanner;
class Person
{
String name;
double Phone_no;
Person(String name ,double Phone_no)
{
   this.name = name;
   this.Phone_no =Phone_no;

}
}
 class Academic_performance extends Person 
{
String deg;
float percentage;
Academic_performance(String name, double Phone_no, String deg, float percentage)
{
   super(name,Phone_no);
   this.deg=deg;
   this.percentage=percentage;

}
void display(){
   System.out.print("Personal information :");
   System.out.print("\nName is "+name);
   System.out.print("\nPhone number is"+Phone_no);
   System.out.print("\nDegree is "+deg);
   System.out.print("\nPercent obtained is "+percentage+"%\n");
               }
}
 class Sports_performance extends Person
{
   String S_name;
   int score;
Sports_performance(String name,double Phone_no,String S_name,int score)
{
   super(name,Phone_no);
   this.S_name=S_name;
   this.score=score;
}  
void display(){
   System.out.println("Personal data : ");
   System.out.println("Name is "+name);
   System.out.println("Phone number is "+Phone_no);
   System.out.println("Sports name is "+S_name);
   System.out.println("Score is "+score);

}
}
 class A1{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      //Input for name
      System.out.print("Enter the name :");
      String name = sc.nextLine();
      //Input for phone number
      System.out.print("Enter the Phone number: ");
      double Phone_no = sc.nextDouble();
      //Input for degree
      sc.nextLine(); 
      System.out.print("Enter the Degree : ");
      String deg = sc.nextLine();
      //Input the percentage
      System.out.print("Enter the Percentage : ");
      float percentage = sc.nextFloat();

      Academic_performance ap =new Academic_performance(name,Phone_no,deg,percentage );
      ap.display();
      sc.nextLine();
      System.out.print("Enter the sports name :");
      String S_name =sc.nextLine();
      System.out.print("Enter the score in sports: ");
      int score = sc.nextInt();
      Sports_performance sp = new Sports_performance(name,Phone_no,S_name,score);
      sp.display();
      sc.close();
   }
}