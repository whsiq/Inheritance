public class Worker  extends Person {

    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if(hoursWorked < 40) {
            return hoursWorked * hourlyPayRate;
        }
        else {
            return ((hoursWorked - 40) * 1.5 * hourlyPayRate) + (40 * hourlyPayRate);
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularHours;
        double otHours;

        if(hoursWorked < 40) {
            otHours = 0;
            regularHours = hoursWorked;
        }
        else {
            regularHours = 40;
            otHours = hoursWorked - 40;
        }
        return "Regular Hours: "+regularHours
                +" | Regular Pay: $"+calculateWeeklyPay(regularHours)
                +" | OT Hours: "+otHours
                +" | OT Pay: $"+calculateWeeklyPay(otHours)
                +" | Total Hours: "+hoursWorked
                +" | Total Pay: $"+calculateWeeklyPay(hoursWorked);
    }
}
