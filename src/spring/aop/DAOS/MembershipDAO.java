package spring.aop.DAOS;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass()+": DOING STUFF: ADDINGAN MEMBER ACCOUNT");
	}
}
