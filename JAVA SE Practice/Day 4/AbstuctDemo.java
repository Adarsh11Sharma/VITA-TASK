
abstract class UIComponentCreator{
    abstract void createComponent();
    void showComponent(){
        System.out.println("let's show component inside the given window");
    }
}

class WindowsUIComponentCreator extends UIComponentCreator
{
	void createComponent()
	{
		System.out.println ("create component as per Windows platform");

	}

    void windowComponent(){
        System.out.println("seconnd function of the window");
    }
}
class MacUIComponentCreator extends UIComponentCreator
{
	void createComponent()
	{
		System.out.println("create component as per Mac platform");
	}
}


public class AbstuctDemo
	{
		static void perform(UIComponentCreator ref)
		{
            if(ref instanceof WindowsUIComponentCreator){
                 WindowsUIComponentCreator temp=(WindowsUIComponentCreator)ref;
                 temp.windowComponent();
            }
			ref.createComponent();
			ref.showComponent();
		}
		public static void main(String[] args) {
            
        
		{
			perform(new WindowsUIComponentCreator());
			perform(new MacUIComponentCreator());
		}
        	}	}