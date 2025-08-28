class base{
   private int num1=10;
    base(){
    }
    base(int a){
        this.num1=a;
        System.out.println(a);
    }
    void disp1(){
        System.out.println(num1);
    }
}
class sub extends base{
    
   private int num2;
    sub(){

    }
    sub(int a){
        super(30);
         this.num2=a;
         System.out.println(num2);
    }
    void disp2(){
        System.out.println(num2);
    }
}

public class Demo4{
    public static void main(String[] args) {
        sub m=new sub(50);
        m.disp1();
        m.disp2();
    }
}