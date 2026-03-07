package feb_20_2026.task2;

public class Company {

    private int id;
    private String name;

    private Branch branch;

    public Company(){}

    public Company(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayCompany(){

        System.out.println("\nCompany ID: "+id);
        System.out.println("Company Name: "+name);

        if(branch!=null)
            branch.displayBranch();
        else
            System.out.println("No Branch Assigned");
    }

    public void createBranch(Branch branch){
        if(this.branch==null){
            this.branch=branch;
            System.out.println("Branch Created");
        }else{
            System.out.println("Branch Already Exists");
        }
    }

    public Branch getBranch(){
        return branch;
    }
}