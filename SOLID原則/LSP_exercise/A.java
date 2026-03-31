package SOLID原則.LSP_exercise;

public class A {
	public void showSalary(SuperClass employee, int baseSalary) {
		System.out.println(employee.getRole() + "薪資：" + employee.calculateSalary(baseSalary));
	}
}
