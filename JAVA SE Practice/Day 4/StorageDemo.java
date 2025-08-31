interface Storage
{
	void store();
	void load();
	void display();
}
class FileStorage implements Storage     // implementation of Storage
{
	public void store()
	{
		System.out.println("store inside filesystem");
	}
	public void load()
	{
		System.out.println("load from filesystem");
	}
	public void display()
	{	
		System.out.println("display from filesystem");
	}
}
class DatabaseStorage implements Storage
{
	public void store()
	{
		System.out.println("store inside Database");
	}
	public void load()
	{
		System.out.println("load from Database");
	}
	public void display()
	{	
		System.out.println("display from Database");
	}
}
class StorageDemo{

    void perform(Storage ref){

    }
    public static void main(String[] args) {
        
    }
}