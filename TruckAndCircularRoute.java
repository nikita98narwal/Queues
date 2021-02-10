import java.util.*;
  import java.io.*;
  
  public class Main {
    static int canCompleteCircuit(int[] gas, int[] cost) {
      
        if(gas.length==0){
		return -1;
	}
			   	
	if(gas.length==1){
		return gas[0]-cost[0]<0?-1:0;
	}
	int start = 0;
	int end = 1;

	int curr= gas[0]-cost[0];

	while(start!=end) {
	     while(curr<0 && start!=end) {

		 curr= curr- (gas[start]-cost[start]);
		 start = (start+1)%gas.length;
		 if(start==0)
		    return -1;
	      }
	     curr+= gas[end]-cost[end];
	     end = (end+1)%gas.length;
	 }
	   if(curr<0)
	      return -1;
	
	   return start; 
}
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] gas = new int[n];
		for(int i = 0; i<n; i++) {
			gas[i] = sc.nextInt();
		}
		int[] cost = new int[n];
		for(int i = 0; i<n; i++) {
			cost[i] = sc.nextInt();
		}
		
		System.out.println(canCompleteCircuit(gas,cost));
    }
  }