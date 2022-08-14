import java.util.Arrays;

public class EmpWageBuilder {
    private final int fullTimeWorking = 1;
    private final int isPartTime = 2;
    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilder() {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String companyName, int wagePerHour, int workingDayInMonth, int maxWorkingHrs) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, wagePerHour, workingDayInMonth, maxWorkingHrs);
        numOfCompany++;
    }

    public void EmpWageCalculateMethod() {
        for (int i =0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(EmpWageCalculateMethod(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i] + "\n");
        }
    }
    public int EmpWageCalculateMethod(CompanyEmpWage companyEmpWage) {
        int empHrs;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int fullTimeCounter = 0;
        int partTimeCounter = 0;
        int absentCounter = 0;

        while (totalEmpHrs <= companyEmpWage.maxWorkingHrs && totalWorkingDays < companyEmpWage.workingDayInMonth) {
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

        System.out.println("Company Name : " + companyEmpWage.companyName);
        System.out.println("Full Time Attendance : " + fullTimeCounter);
        System.out.println("Part Time Attendance : " + partTimeCounter);
        System.out.println("Absent count : " + absentCounter);
        System.out.println("Total Employee Hours : " + totalEmpHrs);
        System.out.println("Total Working Days : " + totalWorkingDays);
        companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.wagePerHour;
        return companyEmpWage.totalEmpWage;
    }
    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Alphabet Inc.", 100, 20, 100);
        empWageBuilder.addCompanyEmpWage("SaiSystem Technology pvt. ltd.", 80, 24, 120);
        empWageBuilder.EmpWageCalculateMethod();
    }
}
