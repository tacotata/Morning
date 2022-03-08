package com.rubypaper;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Morning01Application {
//컴포넌트 스캔이 자동으로 처리되고 있다(원래는 이거 설정 안하면 컨테이너가 컨트롤러를 빈으로 등록하지 않는다)
	//사용자가 정의한 클래스들이 자동으로 빈으로 등록되기 때문에 스프링부트로 애프리케이션을 개발할 때는 패키지 이름을 주의해서 자것ㅇ해야한다 
	//그렇지 않으면 해당 클래스를 빈으로 등록하지 않게 된다 
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
