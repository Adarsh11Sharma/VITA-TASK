abstract class MouseEvent{
    abstract void mouseClicked();
    abstract void mouseEntered();
    abstract void mouseExited();

}
abstract class WindowEvent
{
	abstract void windowClosing();
	abstract void windowOpening();
}

class GuiApp1 extends MouseEvent{

		void mouseClicked()
		{
			System.out.println("mouse clicked");
		}
	
		void mouseEntered()
		{
			System.out.println("mouse entered");
		}
		void mouseExited()
		{
			System.out.println("mouse exited");
		}


}
class GuiApp2 extends WindowEvent{
void windowClosing()
		{
			System.out.println("window closing");
		}
		void windowOpening()
		{
			System.out.println("window opening");
		}

}

public class EventDemo1{

   
    public static void main(String[] args) {
        GuiApp1 A=new GuiApp1();
         GuiApp2 B=new GuiApp2();
         B.windowClosing();
         B.windowOpening();
         A.mouseClicked();
         A.mouseEntered();
         A.mouseExited();
        
    }
}