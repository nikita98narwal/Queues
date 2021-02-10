import java.util.*;
  import java.io.*;
  
  public class Main {
    static void printMax(int arr[], int n, int k)
    {
        Deque<Integer> Qi = new LinkedList<Integer>();
         int i;
        for (i = 0; i < k; ++i) 
        {
            while (!Qi.isEmpty() && arr[i] >= 
                           arr[Qi.peekLast()])
               
                Qi.removeLast(); 
 
            Qi.addLast(i);
        }
 
        for (; i < n; ++i) 
        {
            System.out.print(arr[Qi.peek()] + " ");
            while ((!Qi.isEmpty()) && Qi.peek() <= 
                                             i - k)
                Qi.removeFirst();
            while ((!Qi.isEmpty()) && arr[i] >= 
                              arr[Qi.peekLast()])
                Qi.removeLast();
            Qi.addLast(i);
        }
        System.out.print(arr[Qi.peek()]);
    }
 
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
        
        printMax(arr, arr.length, k);
      
    }
  }