// Q10.	Enter sex m/f  and salary- if m-salary>8000 tax is 5% of salary else 2%
// if f-salary>5000 tax is 3% else tax is 1% find a net salary=salary-tax

import java.util.*;
public class T10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double tax,netsalary;
        int salary=sc.nextInt();
        char sex=sc.next().charAt(0);
        if(sex=='m'){
            if(salary>8000){
               tax=salary*.05;
               netsalary=salary-tax;

               System.out.println(netsalary);
            }else{
                tax=salary*.02;
               netsalary=salary-tax;

               System.out.println(netsalary);
            }

        }else{
            if(salary>5000){
               tax=salary*.03;
               netsalary=salary-tax;

               System.out.println(netsalary);
            }else{
                tax=salary*.01;
               netsalary=salary-tax;

               System.out.println(netsalary);
            }
        }
    }
}