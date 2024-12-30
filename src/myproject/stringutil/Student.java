package src.myproject.stringutil;

public class Student implements Comparable<Student> {

    private long id;
    private String firstName;
    private String lastName;

    private final static long DEFAULT_ID =9999999;
    public Student(long id, String firstName, String lastName) throws Exception {
        if(id<=0)
            throw new Exception("Invalid id");

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName) throws Exception {
//        this.id = -1;
//        this.firstName = firstName;
//        this.lastName = lastName;
        this(DEFAULT_ID,firstName,lastName);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+","+firstName+","+lastName;
    }

    public void printInfo(){
        System.out.println("__________");
        System.out.println("id: "+id);
        System.out.println("firstName: "+firstName);
        System.out.println("lastName: "+lastName);
        System.out.println("__________");

    }

    @Override
    public int compareTo(Student o) {
//        return Long.compare(this.id,o.id);
        return this.firstName.compareTo(o.firstName);
    }
}
