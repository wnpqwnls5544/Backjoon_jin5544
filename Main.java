import java.util.*;
//import java.lang.*;
/* 22.08.27
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
        int y = sc.nextInt();
        if((x>0)&&(y>0)){
            System.out.println("1");
        }
        else if((x<0)&&(y>0)){
            System.out.println("2");
        }
        else if((x<0)&&(y<0)){
            System.out.println("3");
        }
        else if((x>0)&&(y<0)){
            System.out.println("4");
        }

	}
}*/

/*
//Num.8393 
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
}*/

/*
//Num.10871 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i = 0 ; i < N ; i++){
            int a = sc.nextInt();
            if(a < X) System.out.print(a + " ");
        }
    }
}
*/

/*
//Num.10818 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}*/


/*
//Num.8958 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = new String[sc.nextInt()];

        for(int i = 0 ; i < str.length ; i++){
            str[i] = sc.next();
        }

        for(int i = 0 ; i < str.length ; i++){
            int count = 0;
            int sum = 0;

            for(int j = 0 ; j < str[i].length() ; j++){
                if(str[i].charAt(j) == 'O'){count++;}
                else {count = 0;}
                sum += count;
            }

            System.out.println(sum);
        }

    }
}*/

/*
//Num.4344 
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] array;
        int t = sc.nextInt();

        for(int i = 0 ; i < t; i++){

            int s = sc.nextInt();
            array = new int[s];

            double sum = 0;
            double count = 0;

            for(int j = 0 ; j < s ; j++){
                int n = sc.nextInt();
                array[j] = n;
                sum += n;
            }

            double avg = (sum / s);

            for(int j = 0 ; j < s ; j++){
                if(avg < array[j]){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/s)*100);
        }
        sc.close();
    }
}*/


/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        // '0' AscII 48
        // AscII value -> Int value
        // so '0' or -48 
        for(int i = 0 ; i < n ; i++){
            sum += s.charAt(i) - '0';
        }

        System.out.println(sum);

    }
}*/

// num.1712
/*
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(B >= C){
            System.out.println("-1");
        }
        else{
            System.out.println((A/(C-B))+1);
        }
    }
}*/

/* //num.2869
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();
        int day = (int)Math.ceil((double)(V - B) / (A - B));
        // int arrival = 0;
        // int day = 0;
        
        //while(arrival != V){
        //    arrival += A;
        //    day++;
        //    if(arrival >= V){
        //        break;
        //    }
        //    arrival -= B;
        // }       
        System.out.println(day);
    }
}*/

//num 2839
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N == 4 || N == 7){
            System.out.println("-1");
        }
        else if(N % 5 == 0){
            System.out.println(N / 5);
        }
        else if(N % 5 == 1 || N % 5 == 3 ){
            System.out.println((N / 5) + 1);
        }
        else if(N % 5 == 2 || N % 5 == 4){
            System.out.println((N / 5) + 2);
        }
    }
}