public class Associateprofessor extends Employee{
    double bp,da,hra,pf,club,net,gross;
    void getassociate()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateassociate()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("\n------------------------");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("------------------------\n");
        System.out.println("Basic Pay: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS PAY: Rs. "+gross);
        System.out.println("NET PAY: Rs. "+net);
        System.out.println("------------------------\n");
    }
}
