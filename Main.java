public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);

        employee1.tax();
        employee1.bonus();
        employee1.raiseSalary();

        System.out.println(employee1.toString());

    }
}