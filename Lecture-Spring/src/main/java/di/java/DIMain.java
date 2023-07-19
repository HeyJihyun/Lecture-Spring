package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DIMain {
	
	public static void main(String[] args) {
		
		// 객체는 싱글톤
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		
		// xml에서 설정한 객체중 id가 car인 객체 가져오기 getBean("id이름",반환클래스.class)
		Car car = context.getBean("car", Car.class);
		car.printTireBrand();
		
	}
	

}
