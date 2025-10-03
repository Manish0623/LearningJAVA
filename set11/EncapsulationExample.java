class Employee {
    private int id;
    private String name;

    // Setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    // Getters
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}

public class  EncapsulationExample {
    public static void main(String[] args){
        Employee emp = new Employee();

        // Correct way: use setters
        emp.setId(100);
        emp.setName("Dean Jones");

        System.out.println("Id of the employee: " + emp.getId());
        System.out.println("Name of the employee: " + emp.getName());
    }
}
