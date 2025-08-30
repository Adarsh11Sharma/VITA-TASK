interface MouseEvent{
    void mouseClicked();
    void mouseEntered();
	void mouseExited();

}
interface WindowEvent
{
	void windowClosing();
	void windowOpening();
}

class GuiApp implements MouseEvent,WindowEvent{
  public    void mouseClicked()
		{
			System.out.println("mouse clicked");
		}
	
	public	void mouseEntered()
		{
			System.out.println("mouse entered");
		}
	public	void mouseExited()
		{
			System.out.println("mouse exited");
		}
    public    void windowClosing()
		{
			System.out.println("window closing");
		}
	public	void windowOpening()
		{
			System.out.println("window opening");
		}
}
class InterfaceDemo1{
    public static void main(String[] args) {
        GuiApp A=new GuiApp();
        A.windowClosing();
        A.windowOpening();
        A.mouseClicked();
        A.mouseEntered();
        A.mouseExited();
    }
}