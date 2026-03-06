package exception_handling;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaApp {

   public static void execution() {

//       try {
//
//           ArrayList<Integer> al = new ArrayList<Integer>();
//
//           for (int i = 1; i <= 5; i++) {
//               al.add(i);
//           }
//
//           for (int i = 0; i < al.size(); i++) {
//               System.out.println(al.get(i));
//           }
//
//           int[] array = new int[5];
//           int data = 1;
//
//           for (int i = 0; i < array.length; i++) {
//               array[i] = data;
//               data++;
//           }
//
//           for (int i = 0; i < array.length; i++) {
//               System.out.println(array[i]);
//           }
//
//           String string = "java";
//
//           for (int i = 0; i < string.length(); i++) {
//               System.out.println(string.charAt(i));
//           }
//
//       } catch (Throwable throwable) {
//           System.out.println("Exception Handled");
//       }
	   
	   
	   
	   
	   
	   
//	   Scanner scanner = new Scanner(System.in);
//
//       try {
//           System.out.println("Enter Your Id");
//           int id = scanner.nextInt();
//
//           System.out.println("Enter Your Name");
//           String name = scanner.next();
//
//           System.out.println("Id = " + id);
//           System.out.println("Name = " + name);
//       }
//
//       catch (Throwable throwable) {
//           throwable.printStackTrace();
//           System.out.println("Invalid Input");
//       }
//
//       finally {
//           scanner.close();
//           System.out.println("Resource Closed");
//       }
	   
	   
	   
	   
	   
	   
	   Student student = new Student(1, "Raja", "raja@gmail.com", 9876543210L);

       try {
           DB.verifier(student);
           //DB.verifier(null);
       } 
       catch (Throwable throwable) {
           throwable.printStackTrace();
           System.out.println("Student Object Not Found! Please Pass Proper Object!");
       }
   }
}