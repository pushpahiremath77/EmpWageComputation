import java.util.Random;

public class EmpWageComputation {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        // UC-1: Employee Attendance
        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
            // UC-2: Calculate Daily Wage
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
            System.out.println("Daily Wage of Employee: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
