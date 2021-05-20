package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public double missingPint() {

		if (finalGrade() < 60.00) {
			return 60.00 - finalGrade();
		} else {
			return 0.00;
		}

	}

	public String toString() {
		return "Final grade: " + String.format("%.2f", finalGrade());
	}
}
