package march_06_2026.task;

public class University {

    private int id;
    private String name;
    private College[] collegeList;

    public University() {}

    public University(int id, String name, College[] collegeList) {
        this.id = id;
        this.name = name;
        this.collegeList = collegeList;
    }

    public void printDetails() {

        System.out.println("\nUniversity ID : " + id);
        System.out.println("University Name : " + name);

        if (collegeList != null) {

            for (int i = 0; i < collegeList.length; i++) {

                if (collegeList[i] != null) {
                    collegeList[i].printDetails();
                }

            }
        }
    }
}