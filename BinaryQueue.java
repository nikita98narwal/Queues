import java.util.*;
  import java.io.*;
  
  public class Main {
     public static void generate(int n)
	    {
	        
		 Queue<String> q = new ArrayDeque<>();
	        q.add("1");
	 
	        
	        int i = 1;
	        while (i++ <= n)
	        {
	         
	            q.add(q.peek() + '0');
	            q.add(q.peek() + '1');
	 
	            
	            System.out.print(q.poll() + ' ');
	            
	        }
	    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t-->0) {
		 int n = sc.nextInt();
	        generate(n);
	        System.out.println();
	    }
      
    }
  }