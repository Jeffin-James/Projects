import java.io.*;
public class Time {
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    private int hours,seconds,minutes;
    private int input;
    public void timeConverter() throws IOException{
        int choice,ch;
        Time t = new Time();
        do {
            System.out.println("1-->  Hours to Minutes");
            System.out.println("2-->  Hours to Seconds");
            System.out.println("3-->  Seconds to Hours");
            System.out.println("4-->  Minutes to Hours");
            System.out.println("Enter your choice : ");
            choice = Integer.parseInt(sc.readLine());
            switch (choice)
            {
            case 1: {
                t.hoursToMinutes();
                break;
            }
            case 2: {
                t.hoursToSeconds();
                break;
            }
            case 3: {
                t.secondsToHours();
                break;
            }
            case 4: {
                t.minutesToHours();
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
    public void secondsToHours()throws IOException
    {
        System.out.print("Enter the number of seconds: ");
        input = Integer.parseInt(sc.readLine());
        hours = input / 3600;
        minutes = (input % 3600) / 60;
        seconds = (input % 3600) % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
    public void minutesToHours()throws IOException
    {
        System.out.print("Enter the number of minutes: ");
        minutes=Integer.parseInt(sc.readLine());
        hours=minutes/60;
        minutes=minutes%60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
    }
    public void hoursToMinutes()throws IOException
    {
        System.out.println("enter the no of hours");
        hours=Integer.parseInt(sc.readLine());
        minutes=(hours*60);
        System.out.println("Minutes: " + minutes);
    }
    public void hoursToSeconds()throws IOException
    {
        System.out.println("enter the no of hours");
        hours=Integer.parseInt(sc.readLine());
        seconds=(hours*3600);
        System.out.println("Minutes: " + seconds);
    }
}
