import java.util.*;
public class Main
{
    public static void main(String args[])
    {
 	Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR ENROLLMENT NUMBER: ");
	String str=sc.next();
        float math,eng,hin,sci,com;
        System.out.println("ENTER MARKS OF Mathematics: ");
        math=sc.nextFloat();

        System.out.println("ENTER MARKS OF English: ");
        eng=sc.nextFloat();

	System.out.println("ENTER MARKS OF Hindi: ");
        hin=sc.nextFloat();

	System.out.println("ENTER MARKS OF Science: ");
        sci=sc.nextFloat();

	System.out.println("ENTER MARKS OF Computer: ");
        com=sc.nextFloat();


	float totalmarks=math+eng+hin+sci+com;
	System.out.print("\n\nTHE TOTAL MARKS OF THE "+str+" IS "+totalmarks);


	float cgpa=totalmarks/5;
	System.out.print("\n\nTHE CGPA OF THE "+str+" IS "+cgpa);

	char grade;
	if(cgpa>=60 && cgpa<70)
	{
		grade='D';
	}
	else if(cgpa>=70 && cgpa<80)
	{
		grade='C';
	}	
	else if(cgpa>=80 && cgpa<90)
	{
		grade='B';
	}
	else if(cgpa>=90)
	{
		grade='A';
	}
	else
	{
		grade='F';
	}	
	System.out.print("\n\nTHE GRADE OF THE "+str+" IS "+grade);
    }
}