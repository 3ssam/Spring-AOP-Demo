package spring.aop;

import java.util.List;

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
		theDAO.addAccount(new Account());
		theDAO.Check();
		theDAO.Multiple();
		List<Account> c = theDAO.getAllData();
		System.out.println("Data is ======> "+c);
		
		
		// close the context
		context.close();
	}

}
