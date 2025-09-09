public class HelloWOrld {
//return true if and only if x is prime,false otherwise.
	public static boolean isPrime(int x){
	//just check divisibility for all values from `2` through `x - 1` inclusive.
	//(This is not a good algorithm, just use it)
		if (x < 2) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true; 
  
	}

//return the nth prime,
//e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
	public static int nthPrime(int n){
	//Loop through values and check if they are prime until you find n of them
	//use your isPrime function.
	int count = 0; 
	for (int number = 2; ;number++) {
		if (isPrime(number)) {
			if (count == n) {
				return number; 
			}
			count++; 
		}
	} 
}

public static void main(String[] args) {
	int[] Values = {0, 1, 2, 10, 50, 100, 150};
	int[] Primes = {2, 3, 5, 31, 50, 100, 150}; 
	//expected values for 50, 100, and 150 is 233, 547, 877
	
	for (int x = 0; x < Values.length; x++) {
		int result = nthPrime(Values[x]); 
		if (result == Primes[x]) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail expected " + Primes[x] + ", but value returned was " + result); 
		}
	}
}
}
