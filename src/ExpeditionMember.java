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

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
