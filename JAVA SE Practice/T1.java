class Shape{
   private int width;
    private int height;

    public void setWidth(int width){
this.width=width;
    }
    public int getWidth(){
        return width;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }
}




public class T1{
    public static void main(String[] args) {
        Shape m1=new Shape();
        m1.setWidth(10);
        m1.setHeight(20);

       
    }
}