import java.util.Scanner;
public class sum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        int x =input.nextInt();
        System.out.println("enter number 2");
        int y = input.nextInt();
        int sum = x+y;
        System.out.println("sum of integers  "+sum);
    }
}
