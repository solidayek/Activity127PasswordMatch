import java.util.Scanner;

class Main 
{
	public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your username:");
    	String username = sc.nextLine();
    	System.out.println("Enter your password:");
    	String password1 = sc.nextLine();
    	System.out.println("Enter your password again:");
    	String password2 = sc.nextLine();
    	System.out.println();
    	
    	Login website = new Login(username, password1, password2);
      website.matchingPasswords();
      website.compareSecretPassword();
      website.usernameMatch();
      System.out.println("The two passwords matched: " + website.toString());
      System.out.println(website.toString3());
      System.out.println("The username matched: " + website.toString2());

	}
}