import java.util.*;
  

  public class T9ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,r,cube;

int numdigit=0;
int temp=n;
while(temp!=0){
    temp/=10;
    numdigit++;
}
temp=n;

while(n!=0){
    
r=n%10;
int power=1;
for(int i=0;i<numdigit;i++){

    power *=r;
}



sum =sum+power;
n/=10;
}

if(sum==temp){
System.out.println("armstrong number");
}else{
    System.out.println("Not");
}



        }
    }
  