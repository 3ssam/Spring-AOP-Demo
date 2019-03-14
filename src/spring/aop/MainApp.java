package spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.DAOS.AccountDAO;
import spring.aop.DAOS.MembershipDAO;
import spring.aop.config.AOPDemoConfig;
import spring.aop.models.Account;

public class MainApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		// get the bean from spring container
		
		
		AccountDAO theDAO = context.getBean("accountDAO", AccountDAO.class);
		// call the business method
		Account account = new Account();
		account.setName("Hafez");
		account.setLevel("VIP");
		theDAO.addAccount(account);
		theDAO.Check();
		theDAO.Multiple();
		theDAO.setName("Essam");
		theDAO.setUser("Micheal");
		theDAO.getName();
		theDAO.getUser();
		
		MembershipDAO membershipDAO  = context.getBean("membershipDAO", MembershipDAO.class);
		// call the business method
		membershipDAO.addNew();
		membershipDAO.addIntegar(account,2,3);
		
		
		// close the context
		context.close();
	}

}
