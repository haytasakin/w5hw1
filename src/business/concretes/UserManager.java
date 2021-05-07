package business.concretes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {


	private UserDao userDao;
	private User user;
	
	public UserManager() {}
	
 
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}

	public void validation(User user) {
		
		//Email regex
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher=pattern.matcher(user.getEmail());
		if(!matcher.matches()) {
			System.out.println("Geçerli bir email adresi giriniz!!");
			return;
		}
	    if(user.getPassword().length()<6){
	    	
			 System.out.println("Parolanız 6 karakterden fazla olmalıdır!!");
	     	  return;
			  } 
	    if(user.getFirstName().length()<2 ||user.getLastName().length()<2) {
	    	System.out.println("İsim-Soyisim 2 karakterden az olamaz!!");
	    	return;
	    }
	    
	   
	    
	   
	    if (isEmailUsed(user.getEmail()) != null) {
			System.out.println("Bu eposta adresi zaten mevcut");
			return;
		}
	    

	        //Mail ile doğrulama simulasyonu
		    Scanner scanner=new Scanner(System.in);
		    System.out.println("Epostayı doğrulamak için 1e basarak giriş yapın. ");
		    int selection=scanner.nextInt();
		    if(selection !=1) {
		    	System.out.println("Hesap Doğrulanmadı.");
		    	return;
		    }
	        userDao.register(user);

    }
		
		
		  
		
	




	@Override
	public void logIn(String message1,String message2) {

		userDao.login(message1, message2);
	}
	
	public User isEmailUsed(String email) {
		return userDao.isEmailUsed(email);
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	



	
}
