import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8};
        for(int i = 0 ; i<6 ; i++){
            int num = sc.nextInt();
            System.out.print((chess[i] - num) + " ");
        }
	}
}
