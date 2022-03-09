package com.rubypaper.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rubypaper.domain.BoardVO;

@RestController
public class BoardController {
	public BoardController() {
		System.out.println("======>BoardController 생성");
		
	}
	//hello 메소드 리턴 타입 문자열, 문자열에 해당하는 view 만들어야함 
	//하지만 REST 컨트롤러 등록하며 ㄴ리턴되는 문자열이 브라우저에 그대로 출력되기 때문에 
	//별도로 View 화면을 만들 필요가 없다. 
	//@RequestMapping(value="/hello",method=RequestMethod.GET) 이랑 @GetMapping 동일 
	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello : "+name; 
	}
	
	//실행하면 JSON으로 변환된 실행결과 확인 
	@GetMapping("/getBoard")
	public BoardVO getBoard() {
		BoardVO board = new BoardVO();
			board.setSeq(1);
			board.setTitle("테스트제목");
			board.setWriter("테스터");
			board.setContent("테스트 내용입니다:)))))))");
			board.setCreateDate(new Date());
			board.setCnt(0);
			return board;
			
		}
	
	@GetMapping("/getBoardList")
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		for (int i = 1 ; i <=10; i++) {
			BoardVO board = new BoardVO();
			board.setSeq(i);
			board.setTitle("제목" + i);
			board.setWriter("테스터");
			board.setContent(i +"번 내용입니다:)))))))");
			board.setCreateDate(new Date());
			board.setCnt(0);
			boardList.add(board);
			
		}
	return boardList;
		}
	
	
	}


/*@Controller @RestController 차이 

Spring Mvc @Controller  와 @ResponseBody의 조합

RESTful 웹 서비스를 보다 쉽게 개발 할 수 있도록 spring 4.0에서 추가 

@Controller 역할은 Model객체를 만들어 데이터를 담고 View를 찾는것 (스프링2.5qjwjs)

@RestController는 단순히 객체만을 반환하고 객체 데이터는 JSON또는 XML형식으로 HTTP응답에 담아서 전송 (@Controller + @ResPonseBody 와 동일 )
 * 
 * 
 * */
 