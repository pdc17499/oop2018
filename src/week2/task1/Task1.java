package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(a==0||b==0) return a+b;
        while (a!=b){
            if(a>b) a=a-b;
            if(b>a) b=b-a;
        }
       System.out.println(a);
        return 0;
    }

    public static int fibonacci(int n) {
        if(n==0)return 0;
        if(n==1) return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int a= 15;
        int b= 5;
        System.out.println(gcd(a,b));
        System.out.println(fibonacci(10));
    }
}
