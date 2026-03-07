package feb_20_2026.task2;

public class Branch {

    private int id;
    private String name;

    private Department department;

    public Branch(){}

    public Branch(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayBranch(){

        System.out.println("\nBranch ID: "+id);
        System.out.println("Branch Name: "+name);

        if(department!=null)
            department.displayDepartment();
        else
            System.out.println("No Department Assigned");
    }

    public void createDepartment(Department department){
        if(this.department==null){
            this.department=department;
            System.out.println("Department Created");
        }else{
            System.out.println("Department Already Exists");
        }
    }

    public Department getDepartment(){
        return department;
    }
}