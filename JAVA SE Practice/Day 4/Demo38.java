class base{
    public void disp(){
        System.out.println("in base disp");
    }
}

class sub1 extends base
{
	public void disp()
	{
		System.out.println("in sub1 disp");
	}
}
class sub2 extends base
{
	public void disp()
	{
		System.out.println("in sub2 disp");
	}
}
class sub3 extends base
{
	public void disp()
	{
		System.out.println("in sub3 disp");
	}
}

public class Demo38{
    public static void main(String[] args) {
        

        base  arr[]=new base[3];
        arr[0]=new sub1();
        arr[1]=new sub2();
        arr[2]=new sub3();

        for(int i=0;i<arr.length;i++)
		{
			arr[i].disp();
		}
    }
}