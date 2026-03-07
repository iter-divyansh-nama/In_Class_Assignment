package march_06_2026.task;

public class Project {

    private int id;
    private String name;

    public Project() {}

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printDetails() {

        System.out.println("Project ID : " + id);
        System.out.println("Project Name : " + name);
    }
}