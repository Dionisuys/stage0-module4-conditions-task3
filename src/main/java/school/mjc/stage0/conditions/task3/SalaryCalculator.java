package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary >= 1 && salary <= 10000) {
            salary = (int) (salary * 0.85);
            System.out.println(salary);
        } else if (salary <= 20000) {
            salary = (int) (salary * 0.82);
            System.out.println(salary);
        } else if (salary > 20000) {
            salary = (int) (salary * 0.8);
            System.out.println(salary);
        } else {
            System.out.println("wrong input!");
        }
    }
}
