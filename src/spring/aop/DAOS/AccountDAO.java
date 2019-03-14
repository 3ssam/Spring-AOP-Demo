package spring.aop.DAOS;

import java.util.*;

import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String user;
	
	public List<Account> getAllData(boolean flag){
		if (flag)
			throw new RuntimeException("There are Error yes");
		ArrayList<Account> accounts = new ArrayList<>();
		Account account1 = new Account("Micheal", "VIP");
		Account account2 = new Account("Essam", "Local");
		Account account3 = new Account("Hafez", "Premote");
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		System.out.println("Data is ======> Name = "+account1.getName() + "   Level = "+account1.getLevel());
		System.out.println("Data is ======> Name = "+account2.getName() + "   Level = "+account2.getLevel());
		System.out.println("Data is ======> Name = "+account3.getName() + "   Level = "+account3.getLevel());
		return accounts;
	}
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
