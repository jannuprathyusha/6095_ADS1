import java.util.Scanner;
import java.util.Arrays;
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudents = Integer.parseInt(sc.nextLine());
		for (int i=0; i<numOfStudents; i++) {
			String studentDetails = sc.nextLine();
			String[] studentTokens = studentDetails.split(",");
			Student studentObj = new Student(Integer.parseInt(studentTokens[0]),studentTokens[1],Double.parseDouble(studentTokens[2]));
		}
		int numOfQueries = Integer.parseInt(sc.nextLine());
		for (int i=0; i<numOfQueries; i++) {
			String studentQueries = sc.nextLine();
			String[] queryTokens = studentQueries.split(" ");

		}
		switch(queryTokens[0]) {
			case "get":
			for (int i=0; i<numOfQueries; i++) {
                if (((Integer.parseInt(queryTokens[2]))==1)) && ((Integer.parseInt(studentobj.studentTokens[0]))==queryTokens[1]) {
                    System.out.println(studentObj.getstudentName());
                }
                if ((Integer.parseInt(queryTokens[2])==2)) && ((Integer.parseInt(studentobj.studentTokens[0])==queryTokens[1])) {
                	System.out.println(studentObj.gettotalMarks());
                }
			}
		}

	}
}
class Student {
	int rollNumber;
	String studentName;
	double totalMarks;
	public Student(int r, String n, int m) {
		this.rollNumber = r;
		this.studentName = n;
		this.totalMarks = m;
	}
	public String getstudentName() {
		return this.studentName;
	}
	public double gettotalMarks() {
		return this.totalMarks;
	}
} 