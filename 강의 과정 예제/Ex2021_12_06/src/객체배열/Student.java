package ��ü�迭;

public class Student {

	
	//�̸�
	private String name;
	//�й�
	private int number;
	//�ڹ� ����
	private int javaScore;
	
	//2. �޼��� 
	//- ������
	
	public Student(String name, int number, int javaScore) {
		this.name = name;
		this.number = number;
		this.javaScore = javaScore;
	}
	//getName
	//getNumber
	//getJavaScore
	//�ڹ������� �޾ƿͼ� ���ο� ������ �ٽ� �־��ִ� setJavaScore
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
