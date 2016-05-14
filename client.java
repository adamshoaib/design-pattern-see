package designpatterns.banking;

import java.util.Scanner;


public class client {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int as;
		do{
			
		 System.out.println("1.admin_login 2.customer_login\n");
		 int sel=in.nextInt();
		 
		 switch(sel)
		 {
		 case 1:
			  admin a1=new admin();
			  a1.adminlogin();
			  break;
			  
		 case 2:
			 customer c1=new customer();
			 c1.customerlogin();
		      break;
		      
		      
		 default:
			 System.out.println("select any 1");
			 break;
		 } 
			 
	 System.out.println("do you to stay\n");
    	as=in.nextInt();

        } while(as==1);
		
		
		in.close();
}
}