/**
 * 
 */

package feb_23_2026.task2;
import java.util.*;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check : ");
		int a = sc.nextInt();
		NumberVerifierSystem.verifyNum(a);
		sc.close();
	}
}
