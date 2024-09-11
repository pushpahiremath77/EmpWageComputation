import java.util.Random;
public class EmployeeWageComputation {
    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 8;
    public static final int PART_TIME_HOURS = 4;
    public static final int MAX_WORKING_HOURS = 100;
    public static final int MAX_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int totalWage = 0;
        int totalHours = 0;
        int totalDays = 0;

        // Calculate wages until total hours or days limit is reached
        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            int workingHours = getWorkHours();

            if (workingHours > 0) {
                totalDays++;
            }
            totalHours += workingHours;

            // Calculate the daily wage and add to total wage
            int dailyWage = WAGE_PER_HOUR * workingHours;
            totalWage += dailyWage;
        }

        // Display the results
        System.out.println("Total Wage: $" + totalWage);
        System.out.println("Total Hours Worked: " + totalHours);
        System.out.println("Total Days Worked: " + totalDays);
    }

    // Function to get working hours for the day based on employee type
    public static int getWorkHours() {
        Random random = new Random();
        int employeeType = random.nextInt(3); // 0 for absent, 1 for full-time, 2 for part-time

        switch (employeeType) {
            case 1: // Full-time
                return FULL_DAY_HOURS;
            case 2: // Part-time
                return PART_TIME_HOURS;
            default: // Absent
                return 0;
        }
    }
}
