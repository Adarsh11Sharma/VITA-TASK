import  java.util.*;
public class ReverseString{
    public static void ReverseString(String str1){

char str2[]=str1.toCharArray();
int l=str2.length;
int h=l/2;
char temp;
for(int i=0;i<h;i++){
    temp=str2[i];
    str2[i]=str2[l-i-1];
    str2[l-i-1]=temp;

}

String str3=String.valueOf(str2);

System.out.println(str3);
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       
       String str1=sc.nextLine();
       
       System.out.println(str1);
       
ReverseString(str1);


    }

    
}