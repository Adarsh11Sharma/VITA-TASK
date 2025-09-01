/* 1) Create a multi-level inheritance , 
instantiate the child class and observe constructor 
invocation.Also show, if needed how will u invoke 
parent class constructor from child class ?*/
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
class C extends B{
    void disp(){
    System.out.println("C Disp");
   }
   C(){
    super(100);
System.out.println("C Constructor");
   }
}



class first{
    public static void main(String[] args) {
        C c=new C();
        c.disp();
    }
}