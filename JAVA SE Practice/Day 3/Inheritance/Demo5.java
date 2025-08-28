class base{
    
    int num1=10;
    base(){

    }
    void disp1(){
        System.out.println(num1);
    }
}
class sub extends base{
    
    int num2=20;
    sub(){

    }

    void disp2(){
        System.out.println(num2);
    }
}







public class Demo5{
    public static void main(String[] args) {
        sub m=new sub();
        m.disp1();
        m.disp2();
    }
}