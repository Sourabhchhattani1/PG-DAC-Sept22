/*
Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply 
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to 
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the 
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers. 
*/
class ComplexNo
{
	int real;
	int imaginary;
	
	ComplexNo()
	{
		int real=0;
		int imaginary=0;
//System.out.println(real+"+"+imaginary+"i");	//(3+4i)(1+2i)=3+6i+4i-8
	}
	ComplexNo(int real)
	{
		this();
		this.real=real;
		
	}
	ComplexNo(int real , int imaginary)
	{
		this(real);
		this.imaginary=imaginary;
		
	}
	static ComplexNo add(ComplexNo c1 , ComplexNo c2)
	{
		ComplexNo c = new ComplexNo();
		c.real = c1.real+c2.real;
		c.imaginary = c1.imaginary+c2.imaginary;
		
		return c;
	}

	static ComplexNo multiply(ComplexNo c1 , ComplexNo c2)
	{
		
		ComplexNo m = new ComplexNo();
		m.real = (c1.real*c2.real) - (c1.imaginary*c2.imaginary) ;
		m.imaginary = (c1.real*c2.imaginary) + (c1.imaginary*c2.real);
		
		return m;
	}

	
	static void print(ComplexNo c)
	{	
		if(c.imaginary < 0)
			System.out.println(c.real + "" + c.imaginary + "i");
		else
			System.out.println(c.real + "+" + c.imaginary + "i");
	}
	public static void main(String args[])
	{
		ComplexNo c1= new ComplexNo(3,2);
		ComplexNo c2= new ComplexNo(4,-2);
		
		System.out.print("\nComplexNo 1 : ");
		print(c1);
		System.out.print("ComplexNo 2 : ");
		print(c2);
		
		// c1.printSum(c2);
		ComplexNo sum = add(c1,c2);
		System.out.print("\nSum : ");
		print(sum);
		
		ComplexNo product = multiply(c1,c2);
		System.out.print("Product : ");
		print(product);
		
	}
}