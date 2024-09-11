import java.util.Random;

public class EmployeeWageComputation {
    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        // Randomly determine whether the employee is full-time or part-time
        Random random = new Random();
        int employeeType = random.nextInt(2); // 0 for part-time, 1 for full-time

        int workingHours;
        if (employeeType == 1) {
            // Full-time employee
            workingHours = FULL_DAY_HOURS;
            System.out.println("Employee is Full-Time");
        } else {
            // Part-time employee
            workingHours = PART_TIME_HOURS;
            System.out.println("Employee is Part-Time");
        }

        // Calculate the wage
        int dailyWage = WAGE_PER_HOUR * workingHours;

        // Display the calculated daily wage
        System.out.println("Daily Employee Wage: $" + dailyWage);
    }
}
