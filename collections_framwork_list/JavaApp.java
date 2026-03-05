package collections_framwork_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class JavaApp {
	public static void execution() {
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		al1.add(2);
//		al1.add(-2);
//		al1.add(7);
//		al1.add(-9);
//		System.out.println(al1);
//		ArrayList<Integer> al2 = (ArrayList<Integer>) al1.clone();
//		System.out.println(al2);
//		System.out.println(al1.equals(al2));
//		System.out.println(al1.hashCode());
//		System.out.println(al2.hashCode());
		
		
		
		
		
	
//		ArrayList<Object> al = new ArrayList<>();
//		al.add(null);
//		al.add(null);
//		al.add(null);
//		al.add(10);
//		al.add(true);
//		al.add('j');
//		al.add(12.36);
//		al.add("java");
//		al.add(new Product(1,"Apsara","Pencil",2.99));
//		System.out.println(al);
		
		
		

		
		
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//
//		al1.add(1);
//		al1.add(2);
//		al1.add(3);
//		al1.add(4);
//		al1.add(5);
//
//		System.out.println(al1);
//
//		Iterator<Integer> iterator = al1.iterator();
//
//		System.out.println("Forward");
//
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//
//		ListIterator<Integer> listIterator = al1.listIterator(5);
//
//		System.out.println("Backward");
//
//		while (listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
//		
//		System.out.println(al1);
//		al1.set(2,33);
////		al1.remove(2);
//		System.out.println(al1);
		
		
		
		
		
		
//		HashSet hs = new HashSet();
//
//        hs.add(null);
//        hs.add(null);
//        hs.add(null);
//
//        hs.add(10);
//        hs.add(true);
//        hs.add('j');
//        hs.add(12.34);
//        hs.add("java");
//
//        hs.add(new Product(1, "Apsara", "Pen", 29.99));
//
//        System.out.println(hs);
//		
		
		
		
		
		
//		 Question == write a java program to design and develop the java application to achieve the business logic implementation of performing crud operations on student object as per the end users choice ,, ????
//		 ArrayList<Student> list = new ArrayList<>();
//
//	        Scanner sc = new Scanner(System.in);
//
//	        int choice;
//
//	        do {
//
//	            System.out.println("\n1 Add Student");
//	            System.out.println("2 View Students");
//	            System.out.println("3 Update Student");
//	            System.out.println("4 Delete Student");
//	            System.out.println("5 Exit");
//
//	            System.out.print("Enter Choice: ");
//	            choice = sc.nextInt();
//
//	            switch (choice) {
//
//	            case 1:
//
//	                System.out.print("Enter ID: ");
//	                int id = sc.nextInt();
//
//	                System.out.print("Enter Name: ");
//	                String name = sc.next();
//
//	                System.out.print("Enter Age: ");
//	                int age = sc.nextInt();
//
//	                list.add(new Student(id, name, age));
//
//	                System.out.println("Student Added Successfully");
//
//	                break;
//
//	            case 2:
//
//	                if (list.isEmpty()) {
//	                    System.out.println("No Students Found");
//	                } else {
//
//	                    System.out.println("Student List:");
//
//	                    for (Student s : list) {
//	                        System.out.println(s);
//	                    }
//
//	                }
//
//	                break;
//
//	            case 3:
//
//	                System.out.print("Enter ID to update: ");
//	                int uid = sc.nextInt();
//
//	                for (Student s : list) {
//
//	                    if (s.id == uid) {
//
//	                        System.out.print("Enter new Name: ");
//	                        s.name = sc.next();
//
//	                        System.out.print("Enter new Age: ");
//	                        s.age = sc.nextInt();
//
//	                        System.out.println("Student Updated");
//
//	                    }
//
//	                }
//
//	                break;
//
//	            case 4:
//
//	                System.out.print("Enter ID to delete: ");
//	                int did = sc.nextInt();
//
//	                list.removeIf(s -> s.id == did);
//
//	                System.out.println("Student Deleted");
//
//	                break;
//
//	            }
//
//	        } while (choice != 5);
		
		
		
		
		
		
//		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
//
//        hm.put(1, 11.11);
//        hm.put(-2, -22.22);
//        hm.put(3, 33.33);
//        hm.put(-4, -44.44);
//
//        Set<Integer> keys = hm.keySet();
//        System.out.println(keys);
//
//        Collection<Double> values = hm.values();
//        System.out.println(values);
//
//        System.out.println(hm);
//
//        hm.replace(3, 30.30);
//        hm.remove(-4);
//
//        System.out.println(hm);
		
		
		
		
		
		
//		 int i = 10;
//	        System.out.println("i is : " + i);
//
//	        int j = 0;
//	        System.out.println("j is : " + j);
//
//	        try {
//
//	            int k = i / j; // new ArithmeticException();
//	            System.out.println("k is : " + k);
//
//	            System.out.println("Trying to do Something");
//
//	        }
//	        catch (ArithmeticException arithmeticException) {
//
//	            System.out.println("Cannot Divide Any Number By Zero!");
//
//	        }
		
		
		
		
		
		String s = null;

        try {
            System.out.println(s + " " + s.length());
        }

        catch(NullPointerException nullPointerException) {
            System.out.println("Cannot Perform Anything On Null");
        }
	}
}