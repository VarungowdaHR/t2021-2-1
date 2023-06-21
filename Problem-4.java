import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Problem_4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter value of n : ");
        int n=sc.nextInt(); 

        //number of elements in input. (In given question n is not mentioned, in java it is required to collect the values of the array input, since we cannot directly collect array. for simplicity I taken "n" as number of elements in given input, then we enter n array elements);
        //example input:
        //"Enter value of n :
        //11
        //"Enter space seperated n integers: "
        //1 2 8 9 12 46 76 82 15 20 30
        System.out.println("Enter space seperated "+n+" integers: ");
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        sc.close();

        HashMap<Integer, Integer> ans=new HashMap<>();

        getResult(arr, ans);
        System.out.println("output: ");
        System.out.println(ans);
    }

    private static void getResult(ArrayList<Integer> arr, HashMap<Integer, Integer> ans){
        for(int i=1;i<=9;i++){
            int temp=0;
            for(int num:arr){
                if(num%i==0) temp++;
            }
            ans.put(i, temp);
        }
    }
    
}
