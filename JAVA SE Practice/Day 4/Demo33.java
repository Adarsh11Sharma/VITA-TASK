interface emp1{
    void disp1();
}
interface emp2 extends emp1{
    void disp2();
}
class sub1 implements emp2{
    public void disp1(){
        System.out.println("sub1 disp1");
    }
    public void disp2(){
        System.out.println("sub2 disp2");
    }
}
public class Demo33{
    public static void main(String[] args) {
        sub1 s1=new sub1();
        s1.disp2();
        s1.disp1();
    }
}