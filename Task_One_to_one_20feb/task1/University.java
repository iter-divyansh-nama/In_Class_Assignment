package feb_20_2026.task1;

public class University {

    private int id;
    private String name;

    private College college;

    public University(){}

    public University(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayUniversity(){

        System.out.println("\nUniversity ID: "+id);
        System.out.println("University Name: "+name);

        if(college!=null)
            college.displayCollege();
        else
            System.out.println("No College Assigned");
    }

    public void createCollege(College college){
        if(this.college==null){
            this.college=college;
            System.out.println("College Created");
        }else{
            System.out.println("College Already Exists");
        }
    }

    public void readCollege(){
        if(college!=null)
            college.displayCollege();
        else
            System.out.println("No College Found");
    }

    public College getCollege(){
        return college;
    }
}