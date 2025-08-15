// Q1.	Swap 2 variable without using 3rd variable .(three answer)
public class T1{
    public static void main(String[] args) {
        int a=5;
        int b=10;

        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a);
        System.out.println(b);
    }
}