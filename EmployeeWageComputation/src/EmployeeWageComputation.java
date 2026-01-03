import java.util.Random;

public class EmployeeWageComputation {

    public void checkAttendance() {
        Random random = new Random();
        int isPresent = random.nextInt(2);

        if (isPresent == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public void calculateDailyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;

        int dailyWage = wagePerHour * fullDayHour;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }

}
