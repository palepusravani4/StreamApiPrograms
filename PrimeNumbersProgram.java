package StreamApiPrograms;

import java.util.Arrays;

public class PrimeNumbersProgram {
	public static void main(String[] args) {
		
	
	
	  int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};

      // Filtering prime numbers
      int[] primeNumbers = Arrays.stream(numbers)
                                 .filter(PrimeNumbersProgram::isPrime)
                                 .toArray();

      System.out.println("Prime Numbers: " + Arrays.toString(primeNumbers));
  }

  // Method to check if a number is prime
  private static boolean isPrime(int num)
  {
      if (num < 2)
      {
          return false;
      }
      for (int i = 2; i <= num/2; i++)
      {
          if (num % i == 0)
          {
              return false;
          }
      }
      return true;
  }

}
