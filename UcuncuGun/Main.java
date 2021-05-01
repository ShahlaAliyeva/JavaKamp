package HomeTasks.UcuncuGun;

public class Main {
    public static void main(String[] args) {
        Instructor engin = new Instructor();
        engin.setFirstName("Engin");
        engin.setLastName("Demirog");
        engin.setCourseName("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
        InstuctorManager instuctorManager1 = new InstuctorManager();
        instuctorManager1.createCourse(engin);
        System.out.println(engin.getInstructorDetails());

        Student shahla = new Student();
        shahla.setFirstName("Sehla");
        shahla.setLastName("Eliyeva");
        shahla.setComplatingCourse(53);
        shahla.setCoursesTaken("(JAVA + REACT)");

        UserManager userManager1 = new UserManager();
        userManager1.addUser(shahla);

        StudentManager studentManager1 = new StudentManager();
        studentManager1.enrollCourse(shahla);
        studentManager1.complatinCourseProgram(shahla);
    }
}
