import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        a = sc.nextInt();

        if(a>0 && a<10001){
            for(int i = 1 ; i <= a ; i++){
                sum += i;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("please input 1~10000");
        }
        
    }
}
