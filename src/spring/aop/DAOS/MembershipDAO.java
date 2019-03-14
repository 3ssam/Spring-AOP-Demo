package spring.aop.DAOS;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addNew() {
		System.out.println(getClass()+": DOING STUFF: ADDINGAN MEMBER ACCOUNT");
	}
}
