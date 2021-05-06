package HomeTasks.IkinciGun;

public class Main {
    public static void main(String[] args) {
        Courses course1 = new Courses("Yazılım Geliştirici Yetiştirme Kampı C#", 24,"Kurs Programı","Engin Demiroğ");
        Courses course2 = new Courses("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 32,"Kurs Programı","Engin Demiroğ");
//        Courses course3 = new Courses("Programlamaya Giriş İçin Temel Kurs",,);
        course1.instructorDetails = "Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\n" +
                "Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. Sırasıyla Başkent ve ODTÜ'de Yönetim\n" +
                "Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum. Profesyonel iş hayatıma\n" +
                "ise henüz üniversite birinci sınıftayken başladım.";
        course2.instructorDetails = "Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\n" +
                "Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. Sırasıyla Başkent ve ODTÜ'de Yönetim\n" +
                "Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum. Profesyonel iş hayatıma\n" +
                "ise henüz üniversite birinci sınıftayken başladım.";

        Courses [] courses = {course1,course2};

        InstructorManager instructorManager = new InstructorManager();

        for (Courses course : courses){
            System.out.println(course.name+"\n"+course.courseProgram);
            instructorManager.InstructorDetails(course);
            System.out.println("Tamamlandı: "+course.complating+"% "+"("+course.name+")\n");
        }
        MyCourses myCourses = new MyCourses();
        for (Courses mine : courses){
            if(mine.complating >= 0) {
                myCourses.MyCourses(mine);
            }
        }
    }
}
