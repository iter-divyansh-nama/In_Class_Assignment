package march_06_2026.task;

public class Department {

    private int id;
    private String name;
    private Student[] studentList;

    public Department() {}

    public Department(int id, String name, Student[] studentList) {
        this.id = id;
        this.name = name;
        this.studentList = studentList;
    }

    public void printDetails() {

        System.out.println("\nDepartment ID : " + id);
        System.out.println("Department Name : " + name);

        if (studentList != null) {

            for (int i = 0; i < studentList.length; i++) {

                if (studentList[i] != null) {
                    studentList[i].printDetails();
                }

            }
        }
    }
}