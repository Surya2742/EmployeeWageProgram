public class EmployeeWage {
    private final int fullTimeWorking = 1;
    private final int isPartTime = 2;
    final String companyName;
    final int wagePerHour;
    final int workingDayInMonth;
    final int maxWorkingHrs;
    private int totalEmpWage;
    public EmployeeWage(String companyName, int wagePerHour, int workingDayInMonth, int maxWorkingHrs) {
    this.companyName = companyName;
    this.wagePerHour = wagePerHour;
    this.workingDayInMonth = workingDayInMonth;
    this.maxWorkingHrs = maxWorkingHrs;
    }

    public void EmpWageCalculateMethod() {
        int empHrs;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int fullTimeCounter = 0;
        int partTimeCounter = 0;
        int absentCounter = 0;

        while (totalEmpHrs <= maxWorkingHrs && totalWorkingDays < workingDayInMonth) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 3);
            switch (empCheck) {
                case fullTimeWorking: {
                    empHrs = 8;
                    fullTimeCounter++;
                    break;
                }
                case isPartTime: {
                    empHrs = 4;
                    partTimeCounter++;
                    break;
                }
                default: {
                    empHrs = 0;
                    absentCounter++;
                    break;
                }
            }
            totalEmpHrs = totalEmpHrs + empHrs;
        }

        System.out.println("Company Name : " + companyName);
        System.out.println("Full Time Attendance : " + fullTimeCounter);
        System.out.println("Part Time Attendance : " + partTimeCounter);
        System.out.println("Absent count : " + absentCounter);
        System.out.println("Total Employee Hours : " + totalEmpHrs);
        System.out.println("Total Working Days : " + totalWorkingDays + "\n");
        totalEmpWage = totalEmpHrs * wagePerHour;

    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company : " + companyName + " is $" + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage google = new EmployeeWage("Alphabet Inc. ", 100, 20, 100);
        google.EmpWageCalculateMethod();
        EmployeeWage saiSystem = new EmployeeWage("SaiSystem Technology pvt. ltd.", 80, 24, 120);
        saiSystem.EmpWageCalculateMethod();
        System.out.println(google);
        System.out.println(saiSystem);
    }
}
