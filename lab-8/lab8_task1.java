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
    String surnameYusufzoda58330;
    String firstNameYusufzoda58330;
    String streetYusufzoda58330;
    String zipCodeYusufzoda58330;
    String cityYusufzoda58330;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname:");
        surnameYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter first name:");
        firstNameYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter street:");
        streetYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter zip code:");
        zipCodeYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter city:");
        cityYusufzoda58330 = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surnameYusufzoda58330);
        System.out.println("First name: " + firstNameYusufzoda58330);
        System.out.println("Street: " + streetYusufzoda58330);
        System.out.println("Zip code: " + zipCodeYusufzoda58330);
        System.out.println("City: " + cityYusufzoda58330);
    }
}

class Staff extends Person implements Salary {
    String educationYusufzoda58330;
    String positionYusufzoda58330;

    double hoursYusufzoda58330;
    double rateYusufzoda58330;
    double salaryYusufzoda58330;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter education:");
        educationYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter position:");
        positionYusufzoda58330 = scanner.nextLine();
        System.out.println("Enter hours worked:");
        hoursYusufzoda58330 = scanner.nextDouble();
        System.out.println("Enter hourly rate:");
        rateYusufzoda58330 = scanner.nextDouble();
    }

    public void print1() {
        print();
        System.out.println("Education: " + educationYusufzoda58330);
        System.out.println("Position: " + positionYusufzoda58330);
        System.out.println("Hours worked: " + hoursYusufzoda58330);
        System.out.println("Hourly rate: " + rateYusufzoda58330);
        System.out.println("Salary: " + salaryYusufzoda58330);
    }

    @Override
    public double salaryToPay(double hours, double rate) {
        double overtimeHours = Math.max(hours - 40, 0);
        double overtimePay = salaryForOvertime(overtimeHours, rate);
        double regularPay = (hours - overtimeHours) * rate;
        return salaryYusufzoda58330 = regularPay + overtimePay;
    }
}

public class lab8_task1 {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.initialize1();
        staff.salaryToPay(staff.hoursYusufzoda58330, staff.rateYusufzoda58330);
        staff.print1();
        System.out.println("Should receive bonus: " + Salary.shouldReceiveBonus(5));
    }
}

