public class Login
{
	//attributes
	String user; 
	String pass1;
  String pass2;
  String equals1;
  Boolean matching1;
  Boolean matching2;
  int comparing;
	
  //we can't use these two attributes, since they are declared as "final", meaning they can't essentially be modified any further.
	final String SECRETUSER = "alex";  
	final String SECRETPASSWORD = "sunshine";

  String secretPassword = "sunshines";
  String secretUsername = "alex";
	
	//constructor
	public Login(String _username, String _password, String _password2)
	{
		user = _username;
		pass1 = _password;
    pass2 = _password2;
	}
	
	//methods

 

  public Boolean matchingPasswords(){
    return (pass1.equals(pass2));
  }
  
  public int compareSecretPassword(){
    return (pass1.compareTo(secretPassword));
  }

  public Boolean usernameMatch(){
    return (secretPassword.equalsIgnoreCase(pass1));
  
  }


  


  public String toString(){
    Boolean isMatched = matchingPasswords();
    String x;

    if(isMatched){
      x = "true";
    }else{
      x= "false";

    }
    return x;

  }

  public String toString2(){
    Boolean isMatched = usernameMatch();
    String y;

    if (isMatched){
      y = "true";
    }
    else {
      y = "false";
    }
    return y;

  }

  public String toString3(){

  int h = (pass1.compareTo(secretPassword));

  String secretPasswordDistance = "How far away you are from the secret password: ";

  String Secret_Username = "Secret Username: ";

  String Your_Username = "Your Username: ";

  String Secret_Password = "Secret Password: ";

  return secretPasswordDistance + h + "\n"+ Secret_Username + secretUsername + "\n" + Your_Username + user + "\n" + Secret_Password + SECRETPASSWORD + "\n";
  }

  
  }


    
