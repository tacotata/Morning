package com.rubypaper;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Morning01Application {

	public static void main(String[] args) {
		SpringApplication.run(Morning01Application.class, args);
	//SpringApplication application = new SpringApplication(Morning01Application.class);
	//톰캣 구동 안하고 일반 자바 애플리케이션으로 실행 none  웹 애프리케이션  기존 mvc로 구동 servlet
	//reactive 스피링 5.0에서 추가 된 비동기 처리와 논블로킹 입출력(non-bloking i/o)지원 웹플러스 적용 할 때 사용 
	//application.setWebApplicationType(WebApplicationType.NONE);
	//배너가리기 
	//application.setBannerMode(Banner.Mode.OFF);
	//application.run(args);
	
	
	}

}
