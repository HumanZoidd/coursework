
public class EmployeeBook {
    private Employee[] employee;

    public EmployeeBook() {
        this.employee = new Employee[10];
        employee[0] = new Employee("Харитонов Сергей Николаевич", 1, 150000);
        employee[1] = new Employee("Ганина Елена Валерьевна", 2, 145000);
        employee[2] = new Employee("Боярский Михаил Сергеевич", 4, 140000);
        employee[3] = new Employee("Протасов Григорий Михайлович", 5, 180000);
        employee[4] = new Employee("Мараховский Александр Константинович", 3, 139000);
        employee[5] = new Employee("Морозов Aнтон Михайлович", 4, 160000);
        employee[6] = new Employee("Орлова Любовь Геннадьевна", 1, 150000);
        employee[7] = new Employee("Гутов Михаил Сергеевич", 5, 130000);
        employee[8] = new Employee("Павлов Дмитрий Денисович", 2, 145000);
        employee[9] = new Employee("Гаврилов Александр Олегович",3, 140000);
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void printAllEmployees(Employee[] employees) {
        for (Employee all : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(all);
        }
    }

    public double payAllForMonth(Employee[] employees) {
        double sum = 0;
        for (Employee value : employees) {
            if (employee == null) {
                continue;
            }
            sum += value.getSalary();
        }
        return sum;
    }

    public void minSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        int target = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employee == null) {
                continue;
            }
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employees[target].getFullName());
    }

    public void maxSalary(Employee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        int target = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employee == null) {
                continue;
            }
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employees[target].getFullName());
    }

    public double averagePayAllForMonth(Employee[] employees) {
        double sum = 0.0;
        int quantity = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            quantity++;
        }
        return sum/quantity;
    }

    public void nameEmployee(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (int i = 1; i < employee.length + 1; i++) {
            if (employee == null) {
                continue;
            }
            System.out.println(i + ") " + employees[i - 1].getFullName());
        }
    }
}