// Q8.	An electric power distribution co. charges its domestic consumers as follows
// follows: consumption units
// a.	0-200			            0.50 perunit
// b.	201-400			100+0.65 pu.excess of 200
// c.	401-600			230+0.80pu.excess of 400
// d.	601 and above	390+1.00pu in excess of 600





import java.util.*;
public class T8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double bill;
        if(n>0 && n<=200){
            bill=n*0.50;
            System.out.println(bill);
            
        }
        else if(n>200 && n<=400){
            bill=100+0.65*n;
            System.out.println(bill);
        }
        else if(n>400 && n<=600){
            bill=230+0.8*n;
            System.out.println(bill);
        }
        else if(n>600 ){
            bill=390+n;
            System.out.println(bill);
        }
        
    }
}