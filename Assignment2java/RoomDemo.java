/*Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three fields. This class
also has a method “volume()” to calculate the volume of this room. Create another class “RoomDemo” which will
use the earlier class, create instances of rooms, and display the volume of room. 
*/
class Room
{
	double height;
	double width;
	double breadth;
	
	Room()
	{
		
	}
	Room(double height,double width,double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	void volume()
	{
		double volume = height*breadth*width;
		System.out.println(volume);
	}
	
}
class RoomDemo
{
	public static void main(String args[])
	{
		Room r1 = new Room(10,20,40);
		System.out.println("Volume");
		r1.volume();
	}
}