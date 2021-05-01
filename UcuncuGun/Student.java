package HomeTasks.UcuncuGun;

public class Student extends User{
    private String coursesTaken;
    private int complatingCourse;

    public String getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getComplatingCourse() {
        return complatingCourse;
    }

    public void setComplatingCourse(int complatingCourse) {
        this.complatingCourse = complatingCourse;
    }
}
