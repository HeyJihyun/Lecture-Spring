package di.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		
		// 객체는 싱글톤
		ApplicationContext context =  new GenericXmlApplicationContext("di-xml.xml");
		
		// xml에서 설정한 객체중 id가 car인 객체 가져오기 getBean("id이름",반환클래스.class)
		Car car = context.getBean("car", Car.class);
//		Tire tire = context.getBean("hankook", Tire.class);
//		car.setTire(tire);
		car.printTireBrand();
		
		/*
		 Tire tire = new KankookTire();
		 Car c = new Car();
		 c.setTire(tire);
		 */
	}
	

}
