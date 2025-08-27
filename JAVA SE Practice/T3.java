
class Emp{
    static int cnt=100;

    static{
        System.out.println("hi Mohit");
    }

    public static int getcnt(){
        return Emp.cnt;
    }
}


public  class T3{

    static{
        System.out.println("hi Muhafi");
    }
    public static void main(String[] args) {
    
    // Emp m1=new Emp();
        System.out.println(Emp.getcnt());
    }
}