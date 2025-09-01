

/* create a class "Vehicle", define a method 
"public void start()" in it. From this class 
derive a class FourWheeler. How will u override 
"start()" method of parent class ? */
class Vehicle{
    public void start(){
        System.out.println("Vehicle start");
    }
}

class FourWheeler extends Vehicle{
    public void start(){
        System.out.println("FourWheeler Start");
    }
}

public class Second{
    
   static void perform(Vehicle ref){
    
    ref.start();

   }
    public static void main(String[] args) {
        perform(new FourWheeler());
    }
}