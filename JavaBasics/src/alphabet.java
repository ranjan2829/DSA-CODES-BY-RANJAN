import java.util.Scanner;
public class alphabet{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);
        if (ch >='a' && ch<= 'z'){
            System.out.println("it's alphabet   "+ch);
        }
        else{
            System.out.println("it's invalid ");
        }













    }
}
