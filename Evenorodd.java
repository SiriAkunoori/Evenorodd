import java.util.Scanner;
public class Evenorodd {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        String result=(number%2==0)?"even":"odd";
        System.out.println("The number "+number+" is "+result+".");
        scanner.close();    
    }    
}
