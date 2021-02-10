import java.util.*;
  import java.io.*;
  
  public class Main {
    static Queue<Integer> reverse(Queue<Integer> q) 
	{  
	    int s = q.size(); 
	    Queue<Integer> ans = new LinkedList<>(); 
	  
	    for (int i = 0; i < s; i++) 
	    { 
	        for (int j = 0; j < q.size() - 1; j++)  
	        { 
	            int x = q.peek(); 
	            q.remove(); 
	            q.add(x); 
	        } 
	        ans.add(q.peek()); 
	        q.remove(); 
	    } 
	    return ans; 
	} 
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
	    Queue<Integer> q = new LinkedList<>();
	    int t = sc.nextInt();
	    while(t-->0) {
	    int n = sc.nextInt();
	    for(int i = 0; i < n; i++) {
	    	q.add(sc.nextInt());
	    }
	    q = reverse(q); 
	    
	    // Print the queue 
	    while (!q.isEmpty())  
	    { 
	        System.out.print(q.peek() + " "); 
	        q.remove(); 
	    } 
	    System.out.println();
	    }
      
    }
  }