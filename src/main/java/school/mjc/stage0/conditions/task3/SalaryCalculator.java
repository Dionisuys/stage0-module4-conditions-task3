package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 1) {
            if (salary <= 10000) {
                System.out.println(salary * 0.85);
            } else if (salary <= 20000) {
                System.out.println(salary * 0.82);
            } else {
                System.out.println(salary * 0.8);
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
