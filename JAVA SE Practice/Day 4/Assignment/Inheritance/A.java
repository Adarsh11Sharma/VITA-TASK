


class V{
    int a=10;
}class w extends V{
    int b=20;
}
class y extends w{
    int k=30;
    int mul;
    void multipley(){
        mul=a*b*k;
        System.out.println(mul);
    }
}
public class A{



public static void main(String[] args) {
    V ab=new y();
    ab.multipley();
}
}

