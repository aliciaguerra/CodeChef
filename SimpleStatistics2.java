import java.io.*;
import java.util.*;

class Statistic {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//turns a string into an int
		int T = Integer.parseInt(br.readLine());
		
		while(T>0) {
			if(1<=T && T<100) {
				String s1 = br.readLine();
				String s2 = br.readLine();
				//constructs a string tokenizer for the specified string
				//StringTokenizer(String str, String delim)
				StringTokenizer str1 = new StringTokenizer(s1, " ");
				//next token returns the next token in the tokenizer's string
				int N = Integer.parseInt(str1.nextToken());
				int K = Integer.parseInt(str1.nextToken());
				int arr[] = new int[N];
				StringTokenizer str2 = new StringTokenizer(s2, " ");
				if(1<=N && N<=10000) {
					for(int i=0; i<N; i++) {
						arr[i] = Integer.parseInt(str2.nextToken());
					}
					
					Arrays.sort(arr);
					double avg = 0;
					if(0<=2*K && 2*K<=N) {
						for(int i=K; i<N-K; i++) {
							avg += arr[i];
						}
						
						avg=avg/(N-2*K);
						System.out.println(avg);
						T--;
					}
						
					}
				}
				
			}
		}
	}
