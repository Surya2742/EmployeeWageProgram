public class EmployeeWage {
    public static void main(String[] args) {
        int fullTimeWorking = 1;
        int fullTimeHour = 8;
        int wagePerHour = 20;
        double empCheck = Math.floor(Math.random() * 2);
        if (empCheck == fullTimeWorking) {
            System.out.println("Employee is Present");
            System.out.println("Working time is " + fullTimeHour + " and the salary is " + fullTimeHour * wagePerHour);
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
