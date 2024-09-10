

package challenges;
import java.util.*;

public class Challenges {

   

    public static void fibonacci(int n) {
        int num1 = 0, num2 = 1;

        // Print the first two numbers of the Fibonacci sequence
        System.out.print(num1 + ", " + num2);

        // Generate the rest of the Fibonacci sequence up to n
        for (int i = 2; i <= n; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
     public static void findMissingNumbers(int[] nums) {
        // Find the minimum and maximum values in the array
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        // Create a set containing all numbers from min to max
        Set<Integer> completeRange = new HashSet<>();
        for (int i = min; i <= max; i++) {
            completeRange.add(i);
        }

        // Remove all numbers in the input array from the complete range set
        for (int num : nums) {
            completeRange.remove(num);
        }

        // Print the missing numbers
        System.out.println("Missing numbers: " + completeRange);
    }

    public static void main(String[] args) {
        System.out.println("challenge 1");
         int n = 10;
        fibonacci(n);
        System.out.println("");
        System.out.println("challenge 2");
        int[] nums = {2, 1, 5, 4, 6, 9, 7, 8, 10};

        
        findMissingNumbers(nums);
    }
    
}
