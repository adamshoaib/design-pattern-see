package designpatterns.banking;

public class notifier {
    admin a1=new admin();
	public void notifyadmin(String customer,String password){
		a1.changepassword(customer,password);
	}
	
	public void notifycustomer(double bal){
		if(bal<100)
		{
		System.out.println("your balance below 100");
		}
	}
	
	
}
