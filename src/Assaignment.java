


public class Assaignment {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();

        int num=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
