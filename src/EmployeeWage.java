public class EmployeeWage {
    public static void main(String[] args) {
        final int fullTimeWorking = 1;
        int fullTimeHour = 8;
        final int isPartTime = 2;
        int partTimeHour = 4;
        int absentHour = 0;
        int wagePerHour = 20;
        int workingDayInMonth = 20;
        int maxWorkingHrs = 100;

        int monthlyWage = 0;
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs < maxWorkingHrs && totalWorkingDays < workingDayInMonth) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 3);
            switch (empCheck) {
                case fullTimeWorking: {
                    empHrs = 8;
                    break;
                }
                case isPartTime: {
                    empHrs = 4;
                    break;
                }
                default: {
                    empHrs = 0;
                    break;
                }
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        monthlyWage = totalEmpHrs * wagePerHour;
        System.out.println("Total Employee Hours" + totalEmpHrs);
        System.out.println("Total Working Days" + totalWorkingDays);
        System.out.println("Employee Monthly Wage = " + monthlyWage);
    }
}
