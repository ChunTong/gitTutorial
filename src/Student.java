/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    List<Course> courseList;

    public Student(String name, String emailAddress, String major) {
        super(name, emailAddress);
        this.major = major;
    }

    public void addCourse(Course c){
        this.courselist.add(c);
    }
    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }

}
