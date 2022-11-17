public class RelativePrimeMatrix{
	public static void main(String[] args) {
		System.out.println(gcd(1, 1));
		int N = Integer.parseInt(args[0]);
		boolean m[][] = new boolean[N][N];
		for(int i=1; i < N; i++){
			for(int j=1; j <= i; j++){
				if(gcd(i, j) == 1){
					m[i][j] = m[j][i] = true;
				}
			}
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				System.out.print(m[i][j]);
				System.out.print('\t');
			}
			System.out.println();
		}
	}

	static int gcd(int a, int b){
		if(b == 0){
			return a;
		}
		int c = a % b;
		return gcd(b, c);
	}
}

