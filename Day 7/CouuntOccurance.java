import  java.util.*;

public class CouuntOccurance{

 public static void CouuntOccurance(String str, char ch){

// char str1[]=str.toCharArray();
// int count=0;
// int n=str1.length;

//  for(int i=0;i<n;i++){
// if(str1[i]==ch){
//     count++;
// }
 

int count=0;
str=str.toLowerCase();

 for(int i=0;i<str.length();i++){
    if(str.charAt(i)==ch){
        count++;
    }
 }

System.out.println(count);
 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       String str=sc.next();
       char ch=sc.next().charAt(0);
    //    String str1=sc.nextLine();
    //    char ch=sc.next().charAt(0);

       System.out.println(str);
    //    System.out.println(str1);
    //    System.out.println(ch);

CouuntOccurance(str,ch);

    }

    
}