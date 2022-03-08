package com.rubypaper.domain;

import java.util.Date;

/*@RestController는 JSP같은 뷰를 별도로 만들지 ㅇ낳는 대신에 컨트롤러 메소드가 리턴한 데이터 자체를 클라이언트로 전달한다 
 * 클라이언트에 전달되는 데이터는 대부분 문자열이거나 VO(value object)나 컬렉션 형태의 자바 객체인데,
 * 자바 객체가 전달되는 경우에는 자동으로 JSON으로 변환하여 처리하게 된다
 * 1.문자열을 리턴하는 경우 
 * -메소드의 리턴 타입이 문자열이이면 브라우저는 응답 프로토콜 보디에 세팅된 문자열 그대로 출력한다
 * 2.vo객체를 리턴하는 경우
 * - vo 객체를 JSON 데이터로 변환하여 응답 프로토콜 보디에 출력한다 (컨트롤러의 메소드에서 vo객체를 리턴하기 위해 BoardVo 클래스를 작성한다 )
 * 3. 컬렉션을 리턴하는 경우 
 * - controller의 메소드가 단순히 vo 객체 하나를 리턴하는 것이 아니라 
 *   여러개의 vo 객체를 배열이나 java.util.List같은 컬렉션에 저장하여 리턴하는 경우가 있다.
 *   이런 경우도 @RextController는  JSON으로 변환하여 처리한ㄴ다 
 * */

//git
///6개의 멤버변수  
//Getter/setter 메소드는  alt +sihft + s 
public class BoardVO {
	private int seq;
	private String title; 
	private String writer;
	private String content;
	private Date CreateDate = new Date();
	private int cnt = 0;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	} 


	
}


