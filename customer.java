package designpatterns.banking;

import java.util.ArrayList;
import java.util.Scanner;

public class customer{
	
    public double balance=0;
    public int id;
    public String name;
    public String password;
    notifier n1=new notifier();
 
    
   
    Scanner in=new Scanner(System.in);
    public customer()
    {
 	   
    }
   public customer(String name,String pass)
   {
	   this.name=name;
	   pass=password;
   }
    
    
    public void customerlogin(){
    	
          
            ArrayList<String> b1 = admin.getList();
    	System.out.println("Members of the bank\n");
            for(int i = 0; i < b1.size(); i++) {   
    		    System.out.println(b1.get(i));
    		    } 
            
            
    	System.out.println("enter your name");
    	String cus=in.next();
    	if(b1.contains(cus))
    	{
    		System.out.println("enter your password");
    		String na=in.next();
    		if(na.equals("hi"))
    		{
    			customeroperation(cus);
    		}
    		else
    		{
    			System.out.println("your not valid customer");
    		}
    		
    	}
    	else
    	{
    		System.out.println("your invalid user");
    	}
    }
		
	
    
    
    public void customeroperation(String cus){
		int as;
		do
		{
			
		System.out.println("1.Deposit_amt 2.Withdraw_amt 3.Get_Balance 4.ResetPassword");
		int wish = in.nextInt();	
	    switch(wish)
     	{
	
	case 1:
		System.out.println("Enter the amount");
		int amount=in.nextInt();
		balance = balance+amount;
		n1.notifycustomer(balance);
		System.out.println("Total balance is" + balance);
	    break;
	       
	case 2:
		
		System.out.println("Enter the amount to be drawn");
		int draw=in.nextInt();
		if(balance<draw)
		{
			System.out.println("No sufficient balance");
		}
		else
		{
			balance=balance-draw;
			System.out.println("balance is"+balance);
		}
		
		 break;
	
	case 3:
		System.out.println("enter your name");
		
		
			
		System.out.println("Your current balance is"+balance);
		break;
		
		
	case 4:
	  
			System.out.println("enter new password");
			String pass=in.next();
		    n1.notifyadmin(cus,pass);
			System.out.println("your request is sent to admin password will be changes in3 working days");
	  
	  break;
	  
	   
		 
	default: 
		
		System.out.println("No additional features!!");
		break;
      }
	System.out.println("Do you want to continue as customer..... press 2 to log out");
	as=in.nextInt();
	}while(as==1);

    }
}
	