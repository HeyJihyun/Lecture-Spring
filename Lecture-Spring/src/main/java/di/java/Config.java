package di.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"di.java"})
@Configuration
public class Config {
	/*
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	@Qualifier("hankook") // �̸� �Ӽ��� �ٲٴ� ��� 1
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Bean(name="kumho") // �̸� �Ӽ��� �ٲٴ� ���2
	public Tire kumhoTire() {
		return new KumhoTire();
	}
	*/
	
	
}
