import java.util.*;
public class Salary {
    public static void main(String args[])
    {
        int choice,cont;
        do
        {
            System.out.println("PAYROLL");
            System.out.println("1.PROGRAMMER \n2.ASSISTANT PROFESSOR \n3.ASSOCIATE PROFESSOR \n4.PROFESSOR ");
            Scanner c = new Scanner(System.in);
            System.out.print("Enter Your Choice:");
            choice=c.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Programmer p=new Programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                    break;
                }
                case 2:
                {
                    Asstprofessor asst=new Asstprofessor();
                    asst.getdata();
                    asst.getasst();
                    asst.display();
                    asst.calculateasst();
                    break;
                }
                case 3:
                {
                    Associateprofessor asso=new Associateprofessor();
                    asso.getdata();
                    asso.getassociate();
                    asso.display();
                    asso.calculateassociate();
                    break;
                }
                case 4:
                {
                    Professor prof=new Professor();
                    prof.getdata();
                    prof.getprofessor();
                    prof.display();
                    prof.calculateprofessor();
                    break;
                }
            }
            System.out.print("Please enter 0 to quit and 1 to continue: ");
            cont=c.nextInt();
        }while(cont==1);
    }
}
