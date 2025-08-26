class MyClass{
    int a,b;

    MyClass(int a,int b){
         this.a=a;
         this.b=b;
    }
     MyClass(int b){
this.b=b;
    }
     MyClass(){

    }

}




public class T2{
    public static void main(String[] args) {
        MyClass m1=new MyClass();
        MyClass m2=new MyClass(5);
        MyClass m3=new MyClass(2,5);
         
         System.out.println(m2.a + m2.b);
         System.out.println(m1.a + m1.b);
         System.out.println(m3.a + m3.b);
    }
}