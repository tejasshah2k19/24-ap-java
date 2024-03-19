
public class ReturnTypeDemo {

	
	int add()
	{
		int a =10;
		int b = 20;
	
		if(a < 0 && b < 0 ) {
			return -1; 
		}
		int c = a+b;
		System.out.println(c);
		return c; 
	}
	public static void main(String[] args) {
		
		
		ReturnTypeDemo obj = new ReturnTypeDemo();
		
		int ans = obj.add(); 
		System.out.println(ans);
		//if a and b is negative then return -1 
		//else return addition of two numbers 
		

		
	}
}

//binary search -> not found return false --found true 