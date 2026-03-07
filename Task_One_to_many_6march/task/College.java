package march_06_2026.task;

public class College {

    private int id;
    private String name;
    private Department[] deptList;

    public College() {}

    public College(int id, String name, Department[] deptList) {
        this.id = id;
        this.name = name;
        this.deptList = deptList;
    }

    public void printDetails() {

        System.out.println("\nCollege ID : " + id);
        System.out.println("College Name : " + name);

        if (deptList != null) {

            for (int i = 0; i < deptList.length; i++) {

                if (deptList[i] != null) {
                    deptList[i].printDetails();
                }

            }
        }
    }
}