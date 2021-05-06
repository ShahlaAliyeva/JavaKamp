package HomeTasks.IkinciGun;

public class MyCourses {
    public void MyCourses(Courses courses){
        System.out.println("Benim kurslarım:\n"+courses.name+"\n"+courses.courseProgram+
                          "\nEğitmeniniz : "+courses.instructor+"\nTamamlandı: "+courses.complating+"%\n"
                          );
    };
}
