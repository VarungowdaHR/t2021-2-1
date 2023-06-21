import java.util.Scanner;

class Problem_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("output: ");
        generateSequence(a);
        sc.close();
    }

    private static void generateSequence(int a){
        if(a<1) return;
        if(a%2==0) a-=1;
        int temp=1;
        for(int i=0;i<a-1;i++){
            System.out.print(temp+", ");
            temp+=2;
        }
        System.out.print(temp);
    }
    
}
