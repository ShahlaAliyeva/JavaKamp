package HomeTasks.UcuncuGun;

public class InstuctorManager {
    public void createCourse(Instructor instructor) {
        System.out.println(instructor.getCourseName() + " -- kursu olusturuldu");
    }

    public void removeCourse(Instructor instructor) {
        System.out.println(instructor.getCourseName() + " -- kursu silindi");
    }

    public void updateCourse(Instructor instructor) {
        System.out.println(instructor.getCourseName() + " -- kursu güncellendi");
    }
}






//    public void add(Instructor course) {
//        System.out.println(" Senin kursun : " + course.courseName);
//    }
//
//    public void addMultiple(Instructor[] courses){
//        for (Instructor courseName : courses){
//            add(courseName);
//        }
//    }