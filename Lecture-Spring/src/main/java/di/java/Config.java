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
	@Qualifier("hankook") // 이름 속성을 바꾸는 방법 1
	public Tire hankookTire() {
		return new HankookTire();
	}
	
	@Bean(name="kumho") // 이름 속성을 바꾸는 방법2
	public Tire kumhoTire() {
		return new KumhoTire();
	}
	*/
	
	
}
