import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String args[]) {

        ArrayList<Worker> workers = new ArrayList<>();

        Worker W1 = new Worker("Chase", "Staggs", "000001", "Mr.", 2001, 15.00);
        Worker W2 = new Worker("Charles", "Thompson", "000002", "Mr.", 2000, 20.00);
        Worker W3 = new Worker("Chuck", "Stagson", "000003", "Mr.", 2002, 12.00);
        SalaryWorker SW1 = new SalaryWorker("Charlie", "Thomps", "000004", "Mr.", 2000, 15.00, 40000.0);
        SalaryWorker SW2 = new SalaryWorker("Charlene", "DuPont", "000005", "Mrs.", 2001, 16.00, 50000.0);
        SalaryWorker SW3 = new SalaryWorker("Skylar", "White", "000006", "Mrs.", 1972, 17.00, 60000.0);

        workers.add(W1);
        workers.add(W2);
        workers.add(W3);
        workers.add(SW1);
        workers.add(SW2);
        workers.add(SW3);

        for (int week = 0; week < 3; week++) {

            if(week == 0) {
                System.out.println("Week 1 Pay");
                System.out.println("=================================================================================================================================================");
                System.out.println("Full Name        |  ID  | YOB | Weekly Pay");
                System.out.println("=================================================================================================================================================");
                for (Worker w : workers) {
                    System.out.printf("%-18s%-8s%-6s%-80s", w.fullName(), w.getID(), w.getYOB(), w.displayWeeklyPay(40));
                    System.out.println();
                }
                System.out.println();
            }
            else if(week == 1) {
                System.out.println("Week 2 Pay");
                System.out.println("=================================================================================================================================================");
                System.out.println("Full Name        |  ID  | YOB | Weekly Pay");
                System.out.println("=================================================================================================================================================");
                for (Worker w : workers) {
                    System.out.printf("%-18s%-8s%-6s%-80s", w.fullName(), w.getID(), w.getYOB(), w.displayWeeklyPay(50));
                    System.out.println();
                }
                System.out.println();
            }
            else if(week == 2) {
                System.out.println("Week 3 Pay");
                System.out.println("=================================================================================================================================================");
                System.out.println("Full Name        |  ID  | YOB | Weekly Pay");
                System.out.println("=================================================================================================================================================");
                for (Worker w : workers) {
                    System.out.printf("%-18s%-8s%-6s%-80s", w.fullName(), w.getID(), w.getYOB(), w.displayWeeklyPay(40));
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
