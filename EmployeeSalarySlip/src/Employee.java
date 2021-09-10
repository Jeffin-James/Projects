import java.util.*;
public class Employee {
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Name of the Employee");
        name = get.nextLine();
        System.out.println("Enter Mail id");
        mailid = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter employee id ");
        empid = get.nextInt();
        System.out.println("Enter Mobile Number");
        mobile = get.nextLong();
    }
    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee id : "+empid);
        System.out.println("Mail id : "+mailid);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+mobile);
    }
}
