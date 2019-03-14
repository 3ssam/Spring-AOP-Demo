package spring.aop.DAOS;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addNew() {
		System.out.println(getClass()+": DOING STUFF: ADDINGAN MEMBER ACCOUNT");
		return true;
	}
}
