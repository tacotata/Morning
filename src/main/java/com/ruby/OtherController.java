package com.ruby;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//패키지가 다른 otherController 포함시키려면 @ComponentScan 어노테이션 추가해서 스캔하고자 하는 패키지를 직접지정
@SpringBootApplication
@ComponentScan(basePackages= {"com.rubypaper", "com.ruby"})
public class OtherController {
	public OtherController() {
		System.out.println("===>OtherController 생성");
	}
}
