import java.util.Scanner;

/// /if, else, else-if


public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Age");
        int age=sc.nextInt();
        System.out.println("Name");
        String name= sc.next();
        if(age>18){
            System.out.println("Given Age of "+name+" is major");
        }else{
            System.out.println("Given Age of "+name+" is minor");
        }
    }
}
