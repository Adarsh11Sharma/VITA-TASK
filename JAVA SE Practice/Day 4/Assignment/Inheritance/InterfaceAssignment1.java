 interface MouseHandler{
void mouseClicked();
void mousePressed();
void mouseReleased();
}

interface WindowHandler{
    void windowClosing();
    void windowClosed();
}

class WindowGUIApp implements MouseHandler,WindowHandler{
   public void windowClosing(){
        System.out.println("window closing");
    }

    public void windowClosed(){
        System.out.println("window closed");
    }

   public void mouseClicked(){
        System.out.println("mouse clicked");
    }
   public void mousePressed(){
        System.out.println("mouse pressed");
    }
   public void mouseReleased(){
        System.out.println("mouseReleased");
    }
}

public class InterfaceAssignment1{
    public static void main(String[] args) {
        WindowGUIApp m=new WindowGUIApp();
        m.mouseClicked();
        m.mousePressed();
        m.mouseReleased();
        m.windowClosed();
        m.windowClosing();
    }
}