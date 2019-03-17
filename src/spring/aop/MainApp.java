package spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.DAOS.AccountDAO;
import spring.aop.DAOS.MembershipDAO;
import spring.aop.config.AOPDemoConfig;
import spring.aop.models.Account;
import spring.aop.services.TrafficFortuneService;

public class MainApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		// get the bean from spring container
		
		TrafficFortuneService service = context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("Main Program Start");
		
		System.out.println("Calling getFortune");
		
		String datd = service.getFortune();
		
		System.out.println("\nMy Fortune is: "+datd);
		
		System.out.println("Finished");
		
		context.close();
	}

}
