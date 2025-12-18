public class Empinc {
    String name;
    double basicSalary;

    Empinc(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void calculateBonus() {
        double bonus;

        if (basicSalary > 30000) {
            bonus = basicSalary * 0.10;
        } else {
            bonus = basicSalary * 0.05;
        }

        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }

    public static void main(String[] args) {
        Empinc emp = new Empinc("Ezu", 36000);
        emp.calculateBonus();
    }
}