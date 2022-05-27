package studentmarks;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
			    double s,r,c,avg;
			    Scanner  sc=new Scanner(System.in);
			    System.out.println("Enter the mark of three subjects");
			    
			    s=sc.nextDouble();
			    r=sc.nextFloat();
			    c=sc.nextFloat();
			    avg=s+r+c/3;
			
			     if(avg>=80)
			      {
			        System.out.println(" A grade is very good: ");
			      }
			
			     else if(avg>=60 && avg<=80)
			      {
			        System.out.println(" B grade is good: ");
			      }
			
			     else if(avg>=50 && avg<60)	
			     {
				    	 System.out.println(" C grade average: ");
			
			     }
			     else	
			     {
			
			    	 System.out.println("Fail...Better Luck next Time");
			
			     }
			}
}
		
