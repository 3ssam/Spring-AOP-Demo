package spring.aop.DAOS;

import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String user;
	
	public void addAccount(Account account) {
		System.out.println(getClass()+": DOING MY WORK: ADDINGAN ACCOUNT");
	}
	
	public boolean Check() {
		System.out.println(getClass()+": DOING TRUE");
		return false;
	}

	public int Multiple() {
		System.out.println(getClass()+": DOING Multiplcation");
		return 0;
	}

	public String getName() {
		System.out.println(getClass()+"in getName() method");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+"in setName() method");
		this.name = name;
	}

	public String getUser() {
		System.out.println(getClass()+"in getUser() method");
		return user;
	}

	public void setUser(String user) {
		System.out.println(getClass()+"in setUser() method");
		this.user = user;
	}

	
}
