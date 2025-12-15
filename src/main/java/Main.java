import java.util.*;
public class Main {
	public static boolean numC(Queue <Integer>q,int x) {
		
		while(!q.isEmpty()) {
			if(q.remove()==x) {
				return true;
			}
		}
		return false;
	}
	public static Queue<Integer> copy(Queue <Integer> q){
		Queue <Integer> newQ1 =new Queue<>();
		Queue <Integer> newQ2 =new Queue<>();

		while(!q.isEmpty()) {
			newQ2.insert(q.head());
			newQ2.insert(q.remove());
			
		}
		while(!newQ1.isEmpty()) {
			q.insert(newQ1.remove());
		}
		return newQ2;

		
	}
	public static double avg(Queue <Integer> q) {
		Queue <Integer> q2=copy(q);

		int sum=0;
		int count=0;
		while(!q2.isEmpty()) {
			sum+=sum=q2.remove();
			count++;
		}
		return sum/count;
	}
	
	
	public static void main (String [] args ) {
		Queue <Integer> q=new Queue<>();
		q.insert(3);
		q.insert(4);
		q.insert(8);
		System.out.println(numC(q,8));
		System.out.println(q);
		System.out.println(avg(q));
		
	}

}
