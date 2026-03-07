package march_06_2026.task;

import java.util.Scanner;

public class JavaApp {

    public static void execution() {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter University ID");
            int uid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter University Name");
            String uname = sc.nextLine();

            System.out.println("Enter number of colleges");
            int totalColleges = sc.nextInt();

            College[] collegeArr = new College[totalColleges];

            for (int i = 0; i < totalColleges; i++) {

                System.out.println("\nEnter College ID");
                int cid = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter College Name");
                String cname = sc.nextLine();

                System.out.println("Enter number of departments");
                int totalDept = sc.nextInt();

                Department[] deptArr = new Department[totalDept];

                for (int j = 0; j < totalDept; j++) {

                    System.out.println("\nEnter Department ID");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Department Name");
                    String dname = sc.nextLine();

                    System.out.println("Enter number of students");
                    int totalStudents = sc.nextInt();

                    Student[] studentArr = new Student[totalStudents];

                    for (int k = 0; k < totalStudents; k++) {

                        System.out.println("\nEnter Student ID");
                        int sid = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Name");
                        String sname = sc.nextLine();

                        System.out.println("Enter number of projects");
                        int totalProjects = sc.nextInt();

                        Project[] projArr = new Project[totalProjects];

                        for (int m = 0; m < totalProjects; m++) {

                            System.out.println("\nEnter Project ID");
                            int pid = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter Project Name");
                            String pname = sc.nextLine();

                            projArr[m] = new Project(pid, pname);
                        }

                        studentArr[k] = new Student(sid, sname, projArr);
                    }

                    deptArr[j] = new Department(did, dname, studentArr);
                }

                collegeArr[i] = new College(cid, cname, deptArr);
            }

            University uni = new University(uid, uname, collegeArr);

            System.out.println("\n\n----- DATA OUTPUT -----");

            uni.printDetails();

        }

        catch (Exception e) {

            System.out.println("Invalid Input");

        }

        finally {

            sc.close();
            System.out.println("\nProgram Completed");

        }
    }
}