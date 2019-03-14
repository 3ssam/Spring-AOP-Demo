package spring.aop.DAOS;

import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Component
public class AccountDAO {
	
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


}
