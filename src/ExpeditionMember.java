//Creating class with name, studentID and a public static field called member counter
public class ExpeditionMember {
    private String name;
    private String studentID;
    public static int member_counter = 0;

    // Constructor
    public ExpeditionMember(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        member_counter++;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }

    //Setter for name
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
