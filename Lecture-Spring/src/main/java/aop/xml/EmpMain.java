package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 
 Spring AOP Ư¡1
 1.Runtime ���
 2.Proxy ���
 3.interface ���
 
 */
public class EmpMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
		
		Employee emp01 = context.getBean("programmer", Employee.class);
		emp01.work();
		
		Employee designer = context.getBean("designer", Employee.class);
		designer.work();
		
	}

}
