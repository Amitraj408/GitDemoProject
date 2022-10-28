

public class ArmstrongNumber {
	
	

	public static void main(String[] args) {
		boolean aarmstrong = isAarmstrong(370);
		if(aarmstrong)
			System.out.println("number is aarmstrong");
		else
			System.out.println("number is not armstrong");
		

	}
	
	public static boolean isAarmstrong(int number) {
 		int temp =number;
		int sum =0;
		while(number>0) {
		int lastDigit = number%10;
		sum += lastDigit*lastDigit*lastDigit;
		number=number/10;//here number is decreasing and reached to zero so don't compare sum to number
		}
		if(sum==temp) {
			return true;
		}
			
			
		return false;
	}

}
