import java.io.*;

public class AllConverter {
    public static void main(String[] args) throws IOException{
        int choice , ch ;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Currency c = new Currency();
        Distance d = new Distance();
        Time t = new Time();
        do {
            System.out.println("1  -->  Currency Converter");
            System.out.println("2  -->  Distance Converter");
            System.out.println("3  -->  Time Converter");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(sc.readLine());
            switch (choice)
            {
                case 1 :
                {
                    System.out.println("Currency Converter\n");
                    c.currencyConverter();
                    break;
                }
                case 2 :
                {
                    System.out.println("Distance Converter\n");
                    d.distanceConverter();
                    break;
                }
                case 3 :
                {
                    System.out.println("Time Converter\n");
                    t.timeConverter();
                    break;
                }
                default :
                {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println("Enter 0 to quit and 1 to continue ");
            ch=Integer.parseInt(sc.readLine());
        }
        while(ch==1);
    }
}
