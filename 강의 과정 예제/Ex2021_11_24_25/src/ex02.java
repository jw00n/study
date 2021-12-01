import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/*
	회원가입하는 프로그램을 만들고싶다!
	아이디 중복체크 기능을 구현하고 싶다
	-> 기존에 가입되어있는 id들 중에서 새로 입력한 id와 같은 값이 있는지 검사
		 */
		
		//기존 아이디
		String str1="id1";
		String str2="id2";
		String str3="id3";
		String str4="id4";
		String str5="id5";
		
		//2) 새로 가입하는 아이디를 입력받기
		Scanner sc= new Scanner(System.in);
		System.out.println("가입하려는 아이디를 입력해주세요");
		String input= sc.next();//line은 나중에 형변환 해줘야되니까 next로
		System.out.println("아이디를 확인하세요>> "+input);
		
		//중복체크
		//-> 5명중에 input이랑 같은 값이 있다면 중복이라고 출력
		
	
		if(str1.equals(input)||str2.equals(input)||str3.equals(input)||str4.equals(input)||str5.equals(input)) {
			System.out.println("중복입니다.");
		}else System.out.println("아님.");

	}

}
