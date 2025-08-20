import  java.util.*;

public class Palindrone{

 public static void palindrone(String str){
//     int j=0;
//  char ch[]=str.toCharArray();
//  for (int i=ch.length-1;i>0;i--){
//     ch[j++]=ch[i];


// }
// String ss=String.valueOf(ch);

// if(ss.equals(str)){
//     System.out.println("palindrone");
// }else{
//     System.out.println("not");
// }

char ch[]=str.toCharArray();
int i=0,flag=0;
int l=ch.length;
int h=l/2;
for( i=0;i<h;i++){
if(ch[i]==ch[l-1-i]){
    flag =1;
}
}

if(flag==1){
    System.out.println("Palindrone");
}
else{
    System.out.println("Not");
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