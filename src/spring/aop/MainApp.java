package spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.DAOS.AccountDAO;
import spring.aop.DAOS.MembershipDAO;
import spring.aop.config.AOPDemoConfig;

public class MainApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		// get the bean from spring container
		
		
		AccountDAO theDAO = context.getBean("accountDAO", AccountDAO.class);
		// call the business method
		theDAO.addAccount();
		
		MembershipDAO membershipDAO  = context.getBean("membershipDAO", MembershipDAO.class);
		// call the business method
		membershipDAO.addAccount();
		
		
		// close the context
		context.close();
	}

}
