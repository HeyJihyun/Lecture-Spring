package di.pojo;

public class Car {
	
	private Tire tire;
	
	public Car() {
		// car 클래스는 한국타이어클래스에 의존성을 가지고 있음
//		tire = new HankookTire();
//		tire = new KumhoTire();
	}
	
	public Car(Tire tire) {
		this.tire = tire;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public void printTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}

}
