


public class Assaignment {
    public static void main(String[] args) {
        int num=12345;
        while (num>0){
            int dig=num%10;
            System.out.println(dig);
            num=num/10;
        }
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }
        //5
        //4
        //3
        //2
        //1
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        //1
        //2
        //3
        //4
        //5
        System.out.println();

        int num1=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num1+" ");
                num1++;
            }
            System.out.println();
            //1
            //2 3
            //4 5 6
        }
    }
}
