package dataAccess.concretes;

import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {


	private ArrayList<User> users;
	
	public HibernateUserDao(ArrayList<User> users) {
		super();
		this.users = users;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	@Override
	public void register(User user) {
		
		
		
		users.add(user);
		
		System.out.println("Üyeliðiniz tamamlandý."+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void login(String message1, String message2) {


		for (User kullanici : users) {		
			if(message1==kullanici.getEmail() && message2==kullanici.getPassword()){
				System.out.println("Giriþ yapýldý.");
			}
			else {
				System.out.println("Giriþ bilgileriniz  hatalýdýr.");
			}
			}
	}
		
	

	

	@Override
	public User isEmailUsed(String mail) {

		for (User user : users) {
			if (user.getEmail().equals(mail)) {
				return user;
			}
		}
		return null;
	}

		
	}

	
	
	

