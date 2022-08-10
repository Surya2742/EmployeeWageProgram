public class EmployeeWage {
    private final int fullTimeWorking = 1;
    private final int isPartTime = 2;
    void EmpWageCalculateMethod() {
        int wagePerHour = 20;
        int workingDayInMonth = 20;
        int maxWorkingHrs = 100;

        int empHrs;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays < workingDayInMonth) {
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
        int monthlyWage = totalEmpHrs * wagePerHour;
        System.out.println("Total Employee Hours" + totalEmpHrs);
        System.out.println("Total Working Days" + totalWorkingDays);
        System.out.println("Employee Monthly Wage = " + monthlyWage);
    }
    public static void main(String[] args) {
        EmployeeWage em = new EmployeeWage();
        em.EmpWageCalculateMethod();
    }
}
