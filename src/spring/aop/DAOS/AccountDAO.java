package spring.aop.DAOS;

import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account account) {
		System.out.println(getClass()+": DOING MY WORK: ADDINGAN ACCOUNT");
	}

}
