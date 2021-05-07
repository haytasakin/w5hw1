
import java.util.ArrayList;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.GLoggerManagerAdapter;
import core.LoggerManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		//Google ile giriþ yapma-- email ile giriþ.
		LoggerManager loggerManager=new GLoggerManagerAdapter();
		loggerManager.logToSystem("s@gmail.com");
		
        ArrayList<User> users = new ArrayList<>();
 
		UserManager userManager= new UserManager(new HibernateUserDao(users));
		
		//yeni kullancýlar --2.si hatayý görmek için hatalý.
		User ali=new User("Sakin"," Hayta", "a@mail.com", "112211");
		User veli=new User("Al","Veli","1@gmail.com","12345")	;
		User ali2=new User("Sakin"," Hayta", "a@mail.com", "112211");
		
		userManager.validation(ali);
		userManager.validation(ali2);
		//wrong logIn
		userManager.logIn("a@mail.com", "1112211");
		//correct logIn
		userManager.logIn("a@mail.com", "112211");
		
		

		
	}

}
