/*Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write suitable
constructors to initialize them. Add functions like “getVolume” and “getArea” that will return volume and surface
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area. */

class Box
{
	double height;
	double width;
	double breadth;
	
	Box()
	{
		
	}
	Box(double height,double width,double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	double getVolume()
	{
		double volume = height*width*breadth;
		return volume;
		
	}
	double getArea()
	{
		double area = (2*width*(breadth+height));		//2l(b+h) =2lh+2lb
		return area;
	}
	public static void main(String args[])
	{
		Box b1 = new Box(10,20,30);
		System.out.println("Surface Area = "+(b1.getArea()));
		System.out.println("Volume = " + (b1.getVolume()));
	}
}