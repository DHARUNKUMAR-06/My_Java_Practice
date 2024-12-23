import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(X==Y){
            System.out.println(X+" and "+Y+" are equal");
        }
        else if(X>Y){
            System.out.println(X+" greater than "+Y);
        }
        else{
            System.out.println(X+" less than "+Y);
        }
    }
}
