import java.util.*;

// Q5.	Accept a character from user and check if it is vowel or not
public class T5{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){
            System.out.println("vowel");
        }
        else{
            System.out.println("NOT vowel");
        }
    }
}