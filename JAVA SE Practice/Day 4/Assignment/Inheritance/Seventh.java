/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some methods.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/

class Parents1{
    int a=20;
    void disp(){
        System.out.println("Parents1 disp");
    }
}
interface Parents2{
    void print();
}

class Child extends Parents1 implements Parents2{
   public void print(){
        System.out.println("Parents 2 method");
    }
    void disp(){
System.out.println("Parents2 disp");
    }
}





public class Seventh{
    public static void main(String[] args) {
        


Child c=new Child();
c.disp();
c.print();


    }
}