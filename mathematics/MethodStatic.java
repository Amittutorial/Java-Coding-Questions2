class MethodStatic
{
	static void Display()
	{
		 System.out.println("display method.........");
	}
	MethodStatic()
	{   
		System.out.println("Constructor Call :");                // notebook write
	}
	void show()
	{
		System.out.println("show method.......");
		}
	static
	{
		System.out.println("static method block-2 : ");
		{
			System.out.println("non static block");
		}
	}
	public static void main(String args[])
	{   MethodStatic s=new MethodStatic();
		s.Display();
		s.show();
	};
}