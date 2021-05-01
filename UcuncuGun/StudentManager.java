package HomeTasks.UcuncuGun;

public class StudentManager {
    public void enrollCourse(Student student) {
        System.out.println(student.getFirstName()+" "+student.getLastName()+" "+ student.getCoursesTaken()+" -- kursuna kayd olundu.");
    }
    public void removingFromCourse(Student student){
        System.out.println(student.getFirstName()+" "+student.getLastName()+" -- kurs silindi : " + student.getCoursesTaken());
    }
    public void complatinCourseProgram(Student student) {
        System.out.println("Tamamlandi " + student.getComplatingCourse()+"% ");
    }
}
