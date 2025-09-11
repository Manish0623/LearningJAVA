



 class Student {
    private String name;
    private int rollNo;

  
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    // Optional: Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


public class student {
    public static void main(String[] args) {
        Student s = new Student("Manish Singh", 45);

   
        s.display();

      
    }
}

