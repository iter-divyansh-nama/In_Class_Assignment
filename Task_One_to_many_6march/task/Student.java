package march_06_2026.task;

public class Student {

    private int id;
    private String name;
    private Project[] projectList;

    public Student() {}

    public Student(int id, String name, Project[] projectList) {
        this.id = id;
        this.name = name;
        this.projectList = projectList;
    }

    public void printDetails() {

        System.out.println("\nStudent ID : " + id);
        System.out.println("Student Name : " + name);

        if (projectList != null) {

            for (int i = 0; i < projectList.length; i++) {

                if (projectList[i] != null) {
                    projectList[i].printDetails();
                }

            }
        }
    }
}