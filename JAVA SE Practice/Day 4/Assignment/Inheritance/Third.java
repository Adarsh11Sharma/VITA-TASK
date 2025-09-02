//  Go for Hierarchical inheritance, create instances
// of child class and observe constructor invocation.

class A{
   void disp(){
    System.out.println("A Disp");
   }
   A(){
System.out.println("A Constructor");
   }
}

class B extends A{
    int value;
    void disp(){
    System.out.println("B Disp");
   }
   B(int value){
    super();
    this.value=value;
System.out.println("B Constructor   "+value);
   }
}
class C extends A{
    void disp(){
    System.out.println("C Disp");
   }
   C(){
    
    System.out.println("C Constructor");
   }
}
public class Third{

    static void perform(A ref){
    
    ref.disp();

   }
    public static void main(String[] args) {
        perform(new C());
    }
}