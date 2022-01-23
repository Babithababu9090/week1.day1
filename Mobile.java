package week1.day1;

public class Mobile {
	
	public void sendMsg()
	{
		System.out.println("Mobile is used to Sending Messeges");
	}
	public void makeCall()
	{
		System.out.println("Mobile is used to Making calls");
	}
	public void saveContact()
	{
		
		System.out.println("Mobile is used to SaveContact");
	}

	public static void main(String[] args) {
		
		Mobile mobobj=new Mobile();
		mobobj.saveContact();
		mobobj.sendMsg();
		mobobj.makeCall();
		

	}

}
