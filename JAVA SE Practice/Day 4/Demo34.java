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
        System.out.println("sub1 disp2");
    }
}
class sub2 extends  sub1{
     public void disp1(){
        System.out.println("sub2 disp1");
    }
     public void disp2(){
        System.out.println("sub2 disp2");
    }

}
public class Demo34{

    static void perform(emp1 ref){
        ref.disp1();
    }
    public static void main(String[] args) {
       perform(new sub2());
    }
}