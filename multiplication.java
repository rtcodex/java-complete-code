//Multiply two integers without using multiplication, division and bitwise operators, and no loops.

public class multiplication {
    
	static int multiply(int x, int y) {
		
		if (y == 0)
			return 0;
	
		if (y > 0)
			return (x + multiply(x, y - 1));
	
		if (y < 0)
			return -multiply(x, -y);
			
		return -1;
	}
	
	// Driver code
	public static void main(String[] args) {
		
        //parameter passed 5 & 11 to obtain result 55
		System.out.print("\n" + multiply(5, 11));
	}
}

/*Output : 55 */