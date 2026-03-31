package SOLID原則.LSP_exercise;

public class SuperClass {
	public String getRole() {
		return "一般員工";
	}

	public int calculateSalary(int baseSalary) {
		if (baseSalary < 0) {
			throw new IllegalArgumentException("薪資不可小於 0");
		}
		return baseSalary;
	}
}
