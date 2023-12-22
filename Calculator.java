import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("This is a Simple Calculator.");
        Scanner readln = new Scanner(System.in);
        char check;
        
        do{
            System.out.println("Input first variable: ");
            double a = readln.nextDouble();
            System.out.println("Input second variable: ");
            double b = readln.nextDouble();
            System.out.println("Input the operation required: ");
            System.out.println("Choose from (+, -, *, / or ^): ");
            char operator = readln.next().charAt(0);

            switch(operator){
                case '+':
                    System.out.println(a + " + " + b + " = " + (a+b));
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + (a-b));
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + (a*b));
                    break;
                case '/':
                    System.out.println(a + " / " + b + " = " + (a/b));
                    break;
                case '^':
                    double result = 1;
                    double temp = b;
                    while(b!=0){
                        b--;
                        result = result * a;
                    }
                    System.out.println(a + " ^ " + temp + " = " + result);
                    break;
                default: 
                    System.out.println("Invalid Operator Input. Try Again. ");
                    break;
            }
            System.out.println("Do you want to try again(Y/N): ");
            check = readln.next().charAt(0);

        }while(Character.toUpperCase(check) == 'Y');
        System.out.println("End of Calculator. ");

        readln.close();
    }
}
