import  java.util.*;

public class DeleteOccurance{

 public static void DeleteOccurance(String str, char ch){

char str1[]=str.toCharArray();
int count=0;
int j=0;
int n=str1.length;
char str2[]=new char[n-count];

 for(int i=0;i<n;i++){
if(str1[i]==ch){
    count++;
    

}
else{
    str2[j++]=str1[i];
}
 }

 String str0=String.valueOf(str2);

System.out.println(str0);
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

DeleteOccurance(str,ch);

    }

    
}