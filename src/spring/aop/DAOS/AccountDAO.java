package spring.aop.DAOS;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass()+": DOING MY WORK: ADDINGAN ACCOUNT");
	}

}
