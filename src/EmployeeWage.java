public class EmployeeWage {
    public static void main(String[] args) {
        final int fullTimeWorking = 1;
        int fullTimeHour = 8;
        final int isPartTime = 2;
        int partTimeHour = 4;
        int absentHour = 0;
        int wagePerHour = 20;
        int workingDayInMonth = 20;
        int empCheck = (int) Math.floor(Math.random() * 3);
        switch (empCheck) {

            case fullTimeWorking: {
                System.out.println("Employee is Present");
                System.out.println("Working time is " + fullTimeHour + " and the salary is " + fullTimeHour * wagePerHour);
                System.out.println("Monthly Wage of Employee is " + fullTimeHour * wagePerHour * workingDayInMonth);
                break;
            }

            case isPartTime: {
                System.out.println("Employee is Working Part Time");
                System.out.println("Working time is " + partTimeHour + " and the salary is " + partTimeHour * wagePerHour);
                System.out.println("Monthly Wage of Employee is " + partTimeHour * wagePerHour * workingDayInMonth);
                break;
            }

            default: {
                System.out.println("Employee is Absent");
                System.out.println("Employee worked for " + absentHour + " Hours and the salary is " + absentHour * wagePerHour);
                System.out.println("Monthly Wage of Employee is " + absentHour * wagePerHour * workingDayInMonth);
                break;
            }

        }
    }
}
