package randomPrograms;
import java.util.Scanner;
import java.util.ArrayList;
public class SieveOfEratosthenes 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		for (int i = 2; i <= n; i++) 
		{
			nums.add(i);
		}
		
//		System.out.println("Before Prime Search: \n" + nums);
		
		int p = nums.get(0);
				
		for (int k = 1; k < nums.size(); k++) 
		{
			for (int i = 2; i <= n; i++) 
			{
				Integer del = p * i;
				
				nums.remove(del);
			}
			
			p = nums.get(k);
		}
		
		int tracker = nums.size();
		
		System.out.println("\nAfter Prime Search: " + nums + "\nOut of " + n + " numbers, only " + tracker + " were prime.");
		
	}
}
