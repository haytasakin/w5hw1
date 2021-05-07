package business.abstracts;

import entities.concretes.User;

public interface UserService {

	void validation(User user);
	void logIn(String message1,String message2);
}
