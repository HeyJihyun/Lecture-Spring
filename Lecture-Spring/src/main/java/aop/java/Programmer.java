package aop.java;

import org.springframework.stereotype.Component;

@Component("programmer")
public class Programmer implements Employee {
	
	@Override
	public void work() {
		System.out.println("����Ʈ���� ������ �մϴ�.");
	}

}