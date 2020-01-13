import java.util.Arrays;

public class TaskScheduler {
	public int leastInterval(char[] tasks, int n) {
		int[] t = new int[26];
		for(char c : tasks){
			t[c-'A'] ++;
		}
		Arrays.sort(t);
		int maxdup = 0;
		while(t[25]==t[25-maxdup]&&maxdup<tasks.length){ maxdup++;}
        return Math.max(tasks.length,(t[25]-1) * (n+1) + maxdup );
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
