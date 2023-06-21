import java.util.Scanner;

class Calculator{
        public double calculate(double a, double b, String operator){
            switch(operator){
                case "+": 
                    return a+b;
                case "-":
                    return a-b;
                case "*":
                    return a*b;
                case "/":
                    return a/b;
                default:
                    return 0;
            }
        }
}

class Problem_1{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the operator");
        String operator=sc.nextLine();
        sc.close();

        Calculator ca=new Calculator();
        System.out.print("output: ");
        System.out.println(ca.calculate(a, b, operator));
    }
}
