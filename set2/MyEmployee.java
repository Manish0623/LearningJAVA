class Employee {
    private int id;
    private String name;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    // Getter and Setter for id
    public void setId(int i) {
        this.id = i; // Fixed: correctly assigning the input value
    }

    public int getId() {
        return id;
    }
}

public class MyEmployee {
    public static void main(String[] args) {
        Employee peter = new Employee();

        peter.setName("Peter Parker");
        peter.setId(10);

        System.out.println("ID: " + peter.getId());
        System.out.println("Name: " + peter.getName());
    }
}


