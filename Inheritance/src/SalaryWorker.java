public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return Math.round((annualSalary / 52) * 100.0) / 100.0;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "Weekly Pay: $"+calculateWeeklyPay(hoursWorked)+" | Weekly pay is a fraction of your yearly salary";
    }
}
