import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Statistic {
	
	public static void main(String[] args) throws Exception{
		
		//BufferedReader reads text from a character-input stream
		//InputStreamReader is a bridge from byte streams to character streams
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		byte T = Byte.parseByte(br.readLine());
		
		double avg = 0;
		
		//While there are more than zero test cases, you continually execute 
		while(T>0) {
			
			//you only execute the code if there are between 1 and 100 test cases
			if(T>=1 && T<=100) {
				
				//s1 is the N and K values for each test case, you read the line in as a string 
				String s1 = br.readLine();
				//s2 is the collection of measurements for each test case, you read the line in as a string
				String s2 = br.readLine();
				//you turn the string into a string array and split up the values by spaces
				String[] token = s1.split(" ");
				String[] numberArr = s2.split(" ");
				Integer N = Integer.parseInt(token[0]);
				Integer K = Integer.parseInt(token[1]);
				
				//you create an integer array to store the measurements in
				int[] numbers = new int[N];
				
				if(N>=1 && N<10000) {
				 for(int i=0; i<N; i++) {
					//parseInt converts a string to an int
					//numberArr is a string array that breaks up the string by spaces
					numbers[i] = Integer.parseInt(numberArr[i]); 
				 }
				}
				
				//sort the integer array
				Arrays.sort(numbers);
				
				//you go through each integer in the int array from K to numbers.length-K
				for(int i=K; i<numbers.length-K; i++) {
				//add up all the numbers
					avg += numbers[i];
				}
				
				//you do the average by dividing the sum by the number of items (N-2K)
				avg = avg/(N-2*K);
				System.out.println(avg);
				avg=0;
				T--;
				
			}
		}
}
}
