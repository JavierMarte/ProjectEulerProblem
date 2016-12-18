package EulerProblems;

public class EulerProblem1 {

	public static int sum(int limit){
		int sum = 0;
		int i = 1;
		while(i <= limit){
			sum = sum + (i * i);			
			i++;						
		}
		i = 1;
		int total = 0;
		int sum2 = 0;
		while(i <= limit){
		total = i + total;
		i++;
			
		}
		sum2 = total * total;
		System.out.println("sum:" + sum);
		System.out.println("sum2:" + sum2);
						
		int answer = sum2 - sum;
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));
	}

}
