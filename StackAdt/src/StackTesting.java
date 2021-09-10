import java.io.*;
public class StackTesting {
    public static void main(String args[]) throws IOException
    {
        int ch,c;
        int i;
        Stack s=new Stack();
        DataInputStream in=new DataInputStream(System.in);
        do
        {
            try
            {
                System.out.println("ARRAY STACK");
                System.out.println("\n1.Push \n2.Pop \n3.Display");
                System.out.print("\nEnter your Choice:");
                ch=Integer.parseInt(in.readLine());
                switch(ch)
                {
                    case 1:
                        System.out.print("Enter the value to push:");
                        i=Integer.parseInt(in.readLine());
                        s.push(i);
                        break;
                    case 2:
                        s.pop();
                        break;
                    case 3:
                        System.out.println("The elements are: ");
                        s.display();
                        break;
                    default:
                        break;
                }
            }
            catch(IOException e)
            {
                System.out.println("IO Error");
            }
            System.out.println("\nPlease enter 0 to quit and 1 to continue ");
            c=Integer.parseInt(in.readLine());
        }while(c==1);
    }
}
