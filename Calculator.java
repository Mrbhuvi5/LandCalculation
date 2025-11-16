import java.util.*;
class Calculator{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=s.nextInt();
        System.out.print("Enter a another number: ");
        int b=s.nextInt();

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

        System.out.println("Add: "+add);
        System.out.println("Sub: "+sub);
        System.out.println("Mul: "+mul);
        System.out.println("Div: "+div);

    }
}