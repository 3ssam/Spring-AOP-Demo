package spring.aop.DAOS;

import org.springframework.stereotype.Component;

import spring.aop.models.Account;

@Component
public class MembershipDAO {

	public boolean addNew() {
		System.out.println(getClass()+": DOING STUFF: ADDINGAN MEMBER ACCOUNT");
		return true;
	}
	
	public int addIntegar(Account account,int i,int j) {
		System.out.println(getClass()+": Your Number is 100");
		return 0;
	}

}
