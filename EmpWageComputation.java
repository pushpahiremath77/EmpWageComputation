import java.util.Random;

public class EmployeeWageComputation {
    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int WORKING_DAYS_IN_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int totalWage = 0;

        // Calculate monthly wage for the employee
        for (int day = 1; day <= WORKING_DAYS_IN_MONTH; day++) {
            Random random = new Random();
            int employeeType = random.nextInt(3); // 0 for absent, 1 for full-time, 2 for part-time

            int workingHours = 0;
            switch (employeeType) {
                case 1: // Full-time
                    workingHours = FULL_DAY_HOURS;
                    break;
                case 2: // Part-time
                    workingHours = PART_TIME_HOURS;
                    break;
                default: // Absent
                    workingHours = 0;
                    break;
            }

            // Calculate the daily wage and add to total wage
            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
        }

        // Display the total monthly wage
        System.out.println("Total Monthly Wage: $" + totalWage);
    }
}

