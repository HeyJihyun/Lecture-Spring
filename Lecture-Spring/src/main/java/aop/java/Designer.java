package aop.java;

import org.springframework.stereotype.Component;

@Component("designer")
public class Designer implements Employee{
	
	@Override
	public void work() {
		System.out.println("������ �þ� �� �����մϴ�.");
	}

}
