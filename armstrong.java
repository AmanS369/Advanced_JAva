class armstrogs { 

public static void main(String[] args) { 

int start=1 , end=500; 

for(int number = start + 1; number < end; ++number) { 

      int digits = 0; 

      int result = 0; 

      int num = number; 

  

      while (num != 0) { 

        num /= 10; 

        ++digits; 

      } 

  

      num = number; 

  

      while (num != 0) { 

        int rem = num % 10; 

        result += Math.pow(rem, digits); 

        num /= 10; 

      } 

  

      if (result == number) { 

        System.out.print(number + " "); 

      } 

    } 

  } 

 

} 
