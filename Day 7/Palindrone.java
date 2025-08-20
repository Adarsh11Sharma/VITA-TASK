import  java.util.*;

public class Palindrone{

 public static void palindrone(String str){
    int j=0;
 char ch[]=str.toCharArray();
 for (int i=ch.length-1;i>0;i--){
    ch[j++]=ch[i];


}
String ss=String.valueOf(ch);

if(ss.equals(str)){
    System.out.println("palindrone");
}else{
    System.out.println("not");
}



 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       String str="nitin";
    //    String str1=sc.nextLine();
    //    char ch=sc.next().charAt(0);

       System.out.println(str);
    //    System.out.println(str1);
    //    System.out.println(ch);

palindrone(str);

    }

    
}