public class EmployeeWage {
    public static void main(String[] args) {
        int fullTimeWorking = 1;
        double empCheck = Math.floor(Math.random() * 2 );
        if (empCheck == fullTimeWorking)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
