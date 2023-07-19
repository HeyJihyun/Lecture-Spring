package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		
		// ��ü�� �̱���
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		
		// xml���� ������ ��ü�� id�� car�� ��ü �������� getBean("id�̸�",��ȯŬ����.class)
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
	}
	

}
