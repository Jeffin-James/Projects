import java.io.*;
public class Currency {
    private double inr, usd;
    private double euro, yen;
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

    public void currencyConverter()  throws  IOException{
        int choice, ch;
        Currency c = new Currency();

        do {
            System.out.println("1-->   Dollar to Rupee ");
            System.out.println("2-->   Rupee to Dollar ");
            System.out.println("3-->   Euro to Rupee ");
            System.out.println("4-->   Rupee to Euro ");
            System.out.println("5-->   Yen to Rupee ");
            System.out.println("6-->   Rupee to Yen ");
            System.out.println("Enter your choice : ");
            choice =Integer.parseInt(sc.readLine());
            switch (choice) {
                case 1: {
                    c.dollarToRupee();
                    break;
                }
                case 2: {
                    c.rupeeToDollar();
                    break;
                }
                case 3: {
                    c.euroToRupee();
                    break;
                }
                case 4: {
                    c.rupeeToEuro();
                    break;
                }
                case 5: {
                    c.yenToRupee();
                    break;
                }
                case 6: {
                    c.rupeeToYen();
                    break;
                }
                default :
                {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println("Enter 0 to quit and 1 to continue ");
            ch =Integer.parseInt(sc.readLine());
        }
        while (ch == 1);
    }
            public void dollarToRupee () throws  IOException
            {
                System.out.println("Enter dollars to convert into Rupees:");
                usd = Double.parseDouble(sc.readLine());
                inr = usd * 73.51;
                System.out.format("Dollar = %.1f equal to INR = %.3f\n",usd,inr);
            }
            public void rupeeToDollar () throws  IOException
            {
                System.out.println("Enter Rupee to convert into Dollars:");
                inr =Double.parseDouble(sc.readLine());
                usd = inr / 73.51;
                System.out.format("INR = %.1f equal to USD = %.3f\n",inr,usd);
            }
            public void euroToRupee () throws  IOException
            {
                System.out.println("Enter euro to convert into Rupees:");
                euro =Double.parseDouble(sc.readLine());
                inr = euro * 86.96;
                System.out.format("Euro = %.1f equal to INR = %.3f\n",euro,inr);
            }
            public void rupeeToEuro () throws  IOException
            {
                System.out.println("Enter Rupees to convert into Euro:");
                inr =Double.parseDouble(sc.readLine());
                euro = (inr / 86.96);
                System.out.format("Rupee = %.1f equal to Euro = %.3f\n",inr,euro);
            }
            public void yenToRupee () throws  IOException
            {
                System.out.println("Enter yen to convert into Rupees:");
                yen = Double.parseDouble(sc.readLine());
                inr = yen * 0.67;
                System.out.format("YEN = %.1f equal to INR = %.3f\n",yen,inr);
            }
            public void rupeeToYen () throws  IOException
            {
                System.out.println("Enter Rupees to convert into Yen:");
                inr =Double.parseDouble(sc.readLine());
                yen = (inr / 0.67);
                System.out.format("INR = %.1f equal to YEN = %.3f\n",inr,yen);
            }

}
