package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("kumho")
	private Tire tire;

	public Car() {
		System.out.println("Car() 생성자 호출...");
	}

//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("생성자 주입....");
	}
	
//	@Autowired
	public Car(@Qualifier("hankook") Tire tire, @Qualifier("kumho") Tire tire2) {
		this.tire = tire;
		System.out.println("Car(Tire tire, Tire Tire2) 생성자 주입....");
		System.out.println(tire.getBrand());
		System.out.println(tire2.getBrand());
	}
	
	public Car(Tire tire, String msg) {
		System.out.println("Car(Tire tire, String msg) 생성자 주입...");
		System.out.println(tire.getBrand() + msg);
	}

//	@Autowired
//	@Qualifier("hankook")
	// Qualifier() 자동주입할 때 매칭되는것이 여러개면 이름으로 지정
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setter 주입....");
	}

	public void printTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}

	

}
