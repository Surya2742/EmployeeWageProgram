public class EmployeeWage {
    public static void main(String[] args) {
        int fullTimeWorking = 1;
        int fullTimeHour = 8;
        int isPartTime = 2;
        int partTimeHour = 4;
        int wagePerHour = 20;
        double empCheck = Math.floor(Math.random() * 3);
        if (empCheck == fullTimeWorking) {
            System.out.println("Employee is Present");
            System.out.println("Working time is " + fullTimeHour + " and the salary is " + fullTimeHour * wagePerHour);
        }
        else if(empCheck == isPartTime) {
            System.out.println("Employee is Working Part Time");
            System.out.println("Working time is " + partTimeHour + " and the salary is " + partTimeHour * wagePerHour);
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
