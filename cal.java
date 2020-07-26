import java.util.Scanner;
public class Cal {

	public static void main(String[] args)
	{
	    int f,s,res;
	    char operate;
	    CalOperation o=new CalOperation();
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter First Number" );
	    f=input.nextInt();
	    System.out.println("Enter Second Number" );
	    s=input.nextInt();
	    System.out.println("Enter Operation +  -  *  /" );
	    
	    operate=input.next().charAt(0); 
	    switch(operate)
	    {
	        case '+':
	            System.out.println(o.add(f,s));
	            break;
	        case '-':
	            System.out.println(o.sub(f,s));
	            break;
	        case '*':
	            System.out.println(o.mul(f,s));
	            break;
	       case '/':
	            System.out.println(o.div(f,s));
	            break;
		default:
			System.out.println("Invalid choice..");
			
         
	    }
	   }
	    
	    
	    
	}