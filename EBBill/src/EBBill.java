import java.util.Scanner;
public class EBBill {
    private int consumerID, initialUnit, finalUnit, unit, flag;
    private double amount;
    private String consumerName;
    private Scanner scanner = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter consumer Id : ");
        consumerID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter consumer Name : ");
        consumerName = scanner.nextLine();
        System.out.println("Enter last month reading : ");
        initialUnit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter current reading : ");
        finalUnit = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\n1.Domestic\t2.Commercial");
        flag = scanner.nextInt();
    }

    public void generateBill() {

        unit = finalUnit - initialUnit;

        if (flag == 1){
            if (unit >= 0 && unit <= 100) {
                amount = unit * 1;
            } else if (unit > 100 && unit <= 200) {
                amount = 100 + ((unit-100) * 2.50);
            } else if (unit > 200 && unit <= 500) {
                amount = 350 + ((unit-200) * 4);
            } else {
                amount = 1550 + unit * 6;
            }
        } else if (flag == 2) {
            if (unit <= 100) {
                amount = unit * 2;
            } else if (unit > 100 && unit <= 200) {
                amount = 100 + ((unit-100) * 4.50);
            } else if (unit > 200 && unit <= 500) {
                amount = 350 + ((unit-200) * 6);
            } else {
                amount = 1550 + unit * 7;
            }
        }
    }

    public void printBill() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Consumer ID          --> " + consumerID);
        System.out.println("Consumer Name        --> " + consumerName);
        System.out.println("Consumed Electricity --> " + unit + " units");
        System.out.println("Bill amount          --> " + amount);
        System.out.println("-------------------------------------------------------------------------------");
    }
}
