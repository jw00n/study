package 객체배열;

public class Student {

	
	//이름
	private String name;
	//학번
	private int number;
	//자바 점수
	private int javaScore;
	
	//2. 메서드 
	//- 생성자
	
	public Student(String name, int number, int javaScore) {
		this.name = name;
		this.number = number;
		this.javaScore = javaScore;
	}
	//getName
	//getNumber
	//getJavaScore
	//자바점수를 받아와서 새로운 점수로 다시 넣어주는 setJavaScore
	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}
	
	
	
	

	
}
