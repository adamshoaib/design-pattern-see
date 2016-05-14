package designpatterns.banking;
import java.util.ArrayList;
import java.util.Scanner;  


public class admin {

	
    public String password=null;
	Scanner in=new Scanner(System.in);
    int as;
  
    static ArrayList<String> c1=new ArrayList<String>();

	
	public void adminlogin(){
		
		
		System.out.println("enter your password\n");
		String na=in.next();
		if(na.equals("hello"))
		{
			adminoperation();
		}
		else
		{
			System.out.println("your not admin\n");
		}
	}
	
	
	public void adminoperation(){
		
		
        
         
		int as;
		do
		{
		
		System.out.println("1.Add_customer 2.Delete_Customer 3.Customer_list\n");
		int wish = in.nextInt();	
	    switch(wish)
     	{
	
	case 1:
		
		 System.out.print("Enter name");
	     String cust=in.next();
	     c1.add(cust);
	     password="hello";
	       break;
	       
	case 2:
		
		System.out.println("enter the customer name to be removed\n");
		String del=in.next();
		
		if(c1.contains(del))
		{
		      c1.remove(c1.indexOf(del));
		}
		else
		{
		    System.out.println("No customer present");
		}
		 break;
	
	case 3:
		    
		for(int i = 0; i < c1.size(); i++) {   
		    System.out.println(c1.get(i));
		    } 
		    
		 break;
		 

		 
	default: 
		
		System.out.println("No additional features!!");
		break;
      }
	System.out.println("Do you want to continue as admin ..press 2 to log out\n");
	as=in.nextInt();
	}while(as==1);
		
	}
	
	
public void changepassword(String customer,String newpass){
	System.out.println("changed");
}

public static ArrayList<String> getList(){
    return c1;
}

	}
