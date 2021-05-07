package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {

	public void register(User user);
	void login(String message1,String message2);
	User isEmailUsed(String mail);

	
	
}
