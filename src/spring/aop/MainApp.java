package spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.DAOS.AccountDAO;
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
		System.out.println("break");
		// call the business method
		theDAO.addAccount();
		// close the context
		context.close();
	}

}
