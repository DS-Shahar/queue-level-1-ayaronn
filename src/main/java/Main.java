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
	
	public static boolean allDivide(Queue<Integer> q1, Queue<Integer> q2) {
    Queue<Integer> temp1 = new Queue<>();
    Queue<Integer> temp2 = new Queue<>();

    boolean divides;

    while (!q1.isEmpty()) {
        int x = q1.remove();
        temp1.insert(x);
        divides = false;

        while (!q2.isEmpty()) {
            int y = q2.remove();
            temp2.insert(y);

            if (y % x == 0) {
                divides = true;
            }
        }

        while (!temp2.isEmpty()) {
            q2.insert(temp2.remove());
        }

        if (!divides) {
            while (!temp1.isEmpty()) {
                q1.insert(temp1.remove());
            }
            return false;
        }
    }

    while (!temp1.isEmpty()) {
        q1.insert(temp1.remove());
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
		
	}

}
