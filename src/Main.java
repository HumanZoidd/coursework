public class Main {

    public static void printSeparator() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees(employeeBook.getEmployee()); // Метод выводящий всех сотрудников.
        printSeparator();
        System.out.println("Общая месячная выплата всем сотрудникам = " + employeeBook.payAllForMonth(employeeBook.getEmployee())); // Месячная выплата всем сотрудникам
        printSeparator();
        employeeBook.minSalary(employeeBook.getEmployee());
        printSeparator();
        employeeBook.maxSalary(employeeBook.getEmployee());
        printSeparator();
        System.out.println("Среднее значение зарплат всех сотрудников = " + employeeBook.averagePayAllForMonth(employeeBook.getEmployee()));
        printSeparator();
        employeeBook.nameEmployee(employeeBook.getEmployee());
    }
}