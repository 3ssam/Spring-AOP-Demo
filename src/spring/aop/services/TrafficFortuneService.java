package spring.aop.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class TrafficFortuneService {

	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Traffic is good";
	}
	
	public String getFortune(boolean flag) {
		if (flag)
			throw new RuntimeException();
		return getFortune();
	}

}
