
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        //5
        //4
        //3
        //2
        //1
        int num=12345;
        while (num>0){
            int dig=num%10;
            System.out.println(dig);
            num =num/ 10;
        }
        System.out.println();

        //1
        //2
        //3
        //4
        //5 lifo
//        Stack<Integer> s=new Stack<>();
//        int input=12345;
//        while (input>0){
//            int digit=input%10;
//            s.push(digit);
//            input /= 10;
//        }
//        while (!s.isEmpty()) {
//            System.out.println(s.pop());
//        }
        int n=12345;
        int rev=0;
        while(n>0){
            int dig=n%10;
            rev=rev*10+dig;
            n=n/10;
        }
        while (rev>0){
            int dig=rev%10;
            System.out.println(dig);
            rev =rev/ 10;
        }
        System.out.println();

        //1
        //2 3
        //4 5 6
        int num1=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();

        }
    }
}

