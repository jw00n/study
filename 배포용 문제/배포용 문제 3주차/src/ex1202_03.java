
public class ex1202_03 {

	public static void main(String[] args) {
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] scoreToString = score.split(",");
		int[] scoreCount = score(scoreToString);

		System.out.println("A : " + scoreCount[0] + "�� �Դϴ�.");
		System.out.println("B : " + scoreCount[1] + "�� �Դϴ�.");
		System.out.println("C : " + scoreCount[2] + "�� �Դϴ�.");
		System.out.println("D : " + scoreCount[3] + "�� �Դϴ�.");
		System.out.println("F : " + scoreCount[4] + "�� �Դϴ�.");

	}

	public static int[] score(String[] scoreCount) {
		int[] count = new int[5];
		String[] grade = { "A", "B", "C", "D", "F" };
		for (int i = 0; i < scoreCount.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (scoreCount[i].equals(grade[j])) {
					count[j]++;
				}
			}
		}
		return count;
	}

}
