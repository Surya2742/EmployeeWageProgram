public class CompanyEmpWage {

    final String companyName;
    final int wagePerHour;
    final int workingDayInMonth;
    final int maxWorkingHrs;
    public int totalEmpWage;
    public CompanyEmpWage(String companyName, int wagePerHour, int workingDayInMonth, int maxWorkingHrs) {
    this.companyName = companyName;
    this.wagePerHour = wagePerHour;
    this.workingDayInMonth = workingDayInMonth;
    this.maxWorkingHrs = maxWorkingHrs;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company : " + companyName + " is $" + totalEmpWage;
    }

}
