package SOLID原則.LSP_exercise;

public class B {
	public static void main(String[] args) {
		A salarySystem = new A();

		SuperClass normalEmployee = new SuperClass();
		SuperClass manager = new SubClass();

		salarySystem.showSalary(normalEmployee, 30000);
		salarySystem.showSalary(manager, 30000);
	}
}
