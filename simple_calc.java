import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lena = new Scanner(System.in);
        System.out.println("Enter 2 values : ");
        int a = lena.nextInt();
        int b = lena.nextInt();
        System.out.println("enter operation : ");
        String op = lena.next();
        int c = 0;
        switch (op){
            case "+" :
                c = a + b;
                System.out.println(c);
                break;
            case "-" :
                c = a - b;
                System.out.println(c);
                break;
            case "*" :
                c = a * b;
                System.out.println(c);
                break;
            case "/" :
                if (b==0){
                    System.out.println("Error");

                }else{
                    float d = (float) a/b;
                    System.out.println(d);

                }
                break;
            case null, default:
                System.out.println("Invaild choice");
        }
    }
}
