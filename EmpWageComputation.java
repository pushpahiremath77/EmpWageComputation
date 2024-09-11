import java.util.Random;

public class EmployeeWageComputation {

    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        // Randomly determine whether the employee is full-time, part-time, or absent
        Random random = new Random();
        int employeeType = random.nextInt(3); // 0 for absent, 1 for full-time, 2 for part-time

        int workingHours = 0;

        // Switch case to handle employee types
        switch (employeeType) {
            case FULL_TIME:
                workingHours = 8;  // Full-time employee works 8 hours
                System.out.println("Employee is Full-Time");
                break;

            case PART_TIME:
                workingHours = 4;  // Part-time employee works 4 hours
                System.out.println("Employee is Part-Time");
                break;

            default:
                System.out.println("Employee is Absent");
                break;
        }

        // Calculate the wage
        int dailyWage = WAGE_PER_HOUR * workingHours;

        // Display the calculated daily wage
        System.out.println("Daily Employee Wage: $" + dailyWage);
    }
}
