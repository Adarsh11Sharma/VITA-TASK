// Q4.	Accept a character from user and reverse the case eg. Input   aout put   A

import java.util.*;

public class T4{
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    char ch=sc.next().charAt(0);

int ascii=(int)ch;
 if(ascii>=65 && ascii<=90){
    int new_ascii=ascii+32;


char ch1= (char)new_ascii;
System.out.println(ch1);
 }
 else if(ascii>=97 && ascii<=122){
     int new_ascii=ascii-32;


char ch1= (char)new_ascii;
System.out.println(ch1);
 }


}
}