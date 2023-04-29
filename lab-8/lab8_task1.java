import java.util.Scanner;
interface Salary {
    // normal interface method
    double salaryToPay(double hours, double rate);

    // default interface method
    default double salaryForOvertime(double hours, double rate) {
        double overtimeRate = 1.5 * rate;
        return (hours - 40) * overtimeRate;
    }

    // static interface method
    static boolean shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}

class Person {
    String surname;
    String firstName;
    String street;
    String zipCode;
    String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        surname = scanner.nextLine();
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter street:");
        street = scanner.nextLine();
        System.out.println("Enter zip code:");
        zipCode = scanner.nextLine();
        System.out.println("Enter city:");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip code: " + zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person implements Salary {
    String education;
    String position;

    double hours;
    double rate;
    double salary;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter education:");
        education = scanner.nextLine();
        System.out.println("Enter position:");
        position = scanner.nextLine();
        System.out.println("Enter hours worked:");
        hours = scanner.nextDouble();
        System.out.println("Enter hourly rate:");
        rate = scanner.nextDouble();
    }

    public void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
        System.out.println("Hours worked: " + hours);
        System.out.println("Hourly rate: " + rate);
        System.out.println("Salary: " + salary);
    }

    @Override
    public double salaryToPay(double hours, double rate) {
        double overtimeHours = Math.max(hours - 40, 0);
        double overtimePay = salaryForOvertime(overtimeHours, rate);
        double regularPay = (hours - overtimeHours) * rate;
        return salary = regularPay + overtimePay;
    }
}

public class lab8_task1 {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1();
        staff.salaryToPay(staff.hours, staff.rate);
        staff.print1();
        System.out.println("Should receive bonus: " + Salary.shouldReceiveBonus(5));
    }
}
