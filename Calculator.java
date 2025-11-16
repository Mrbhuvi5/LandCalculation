import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=s.nextInt();
        System.out.print("Enter a another number: ");
        int b=s.nextInt();

        System.out.println("Enter your choice: \n1.Add\n2.Sub\n3.mul\n4.div");
        int ch=s.nextInt();

        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=0;
        try{
            div=a/b;
        }
        catch(Exception e){
            div=0;
        }

        System.out.println();
        
        switch (ch){
        
        case 1 ->   System.out.println("Add: "+add);
        case 2 -> System.out.println("Sub: "+sub);
        case 3 -> System.out.println("Mul: "+mul);
        case 4 -> System.out.println("Div: "+div);
        default -> System.out.println("Enter a valid Choice");

        }

    }
}