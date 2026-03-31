package SOLID原則.LSP_exercise;

public class SubClass extends SuperClass{
	@Override
	public String getRole() {
		return "主管";
	}

	@Override
	public int calculateSalary(int baseSalary) {
		if (baseSalary < 0) {
			throw new IllegalArgumentException("薪資不可小於 0");
		}
		return baseSalary + 5000;
	}
}