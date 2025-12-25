import java.util.*;
public class Main {
	public static boolean numC(Queue <Integer>q,int x) {
		Queue <Integer> q4=copy(q);
		
		while(!q4.isEmpty()) {
			if(q4.remove()==x) {
				return true;
			}
		}
		return false;
	}
	public static Queue<Integer> copy(Queue<Integer> q) {
	    Queue<Integer> newQ = new Queue<>();
	    Queue<Integer> tempQ = new Queue<>();
	    
	    while (!q.isEmpty()) {
	        int element = q.remove(); 
	        tempQ.insert(element);     
	        newQ.insert(element);     
	    }

	    while (!tempQ.isEmpty()) {
	        q.insert(tempQ.remove()); 
	    }

	    return newQ;  
	}


	public static double avg(Queue <Integer> q) {
		Queue <Integer> q2=copy(q);

		System.out.println(q);
		int sum=0;
		int count=0;
		while(!q2.isEmpty()) 
		{
			sum+=q2.remove();
			count++;
		}
		return sum/count;
	}
	
	public static boolean allDivide(Queue<Integer> q1, Queue<Integer> q2) 
	{
		Queue <Integer> copy1=copy(q1);
		Queue <Integer> copy2=copy(q2);
	    
	    boolean divides;
	
	    while (!copy1.isEmpty()) 
	    {
	        int x = copy1.remove();
	        divides = false;
	
	        while (!copy2.isEmpty()) 
	        {
	            int y = copy2.remove();
	            if (y % x == 0) 
	            {
	                divides = true;
	            }
	        }
	        if (!divides) 
	        {
	        	return false;
	        }
	    }
	    return true;
	}
	
	
	
	
	
	public static boolean appears(Queue<Integer> q, int val) 
	{
	    Queue<Integer> temp = new Queue<>();
	    int count = 0;
	
	    while (!q.isEmpty()) {
	        int x = q.remove();
	        temp.insert(x);
	
	        if (x == val) {
	            count++;
	            if (count == 2) {
	                while (!temp.isEmpty()) {
	                    q.insert(temp.remove());
	                }
	                return true;
	            }
	        } else {
	            count = 0;
	        }
	    }
	
	    while (!temp.isEmpty()) {
	        q.insert(temp.remove());
	    }
	
	    return false;
}


	
	
	public static void main (String [] args ) {
		Queue <Integer> q=new Queue<>();
		q.insert(3);
		q.insert(4);
		q.insert(8);
		System.out.println(numC(q,8));
		System.out.println(q);
		System.out.println(avg(q));
		System.out.println(allDivide(q,q));
		System.out.println(appears(q,8));
	}

}
