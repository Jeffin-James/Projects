import  java.io.*;
public class Distance {
    double km,m,miles;
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    public void distanceConverter() throws  IOException{
        int choice,ch;
        Distance d=new Distance();
        do
        {
            System.out.println("1-->   Meter to Kilometer ");
            System.out.println("2-->   Kilometer to Meter ");
            System.out.println("3-->   Miles to Kilometer ");
            System.out.println("4-->  Kilometer to Miles");
            System.out.println("Enter your choice : ");
            choice=Integer.parseInt(sc.readLine());
            switch(choice)
            {
                case 1:
                {
                    d.mToKm();
                    break;
                }
                case 2:
                {
                    d.kmToM();
                    break;
                }
                case 3:
                {
                    d.milesToKm();
                    break;
                }
                case 4 :
                {
                    d.kmToMiles();
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

    public void kmToM() throws  IOException
    {
        System.out.print("Enter in km ");
        km=Double.parseDouble(sc.readLine());
        m=(km*1000);
        System.out.printf("%.2f KM is equal to %.3f Metres\n",km,m);
    }
    public void mToKm() throws  IOException
    {
        System.out.print("Enter in meter ");
        m=Double.parseDouble(sc.readLine());
        km=(m/1000);
        System.out.printf("%.2f Metres is equal to %.3f KM\n",m,km);
    }
    public void milesToKm() throws  IOException
    {
        System.out.print("Enter in miles");
        miles=Double.parseDouble(sc.readLine());
        km=(miles*1.60934);
        System.out.printf("%.2f Miles is equal to %.3f Kilometers\n",miles,km);
    }
    public void kmToMiles() throws  IOException
    {
        System.out.print("Enter in km");
        km=Double.parseDouble(sc.readLine());
        miles=(km*0.621371);
        System.out.printf("%.2f Kilometers is equal to %.3f Miles\n",km,miles);
    }
}
