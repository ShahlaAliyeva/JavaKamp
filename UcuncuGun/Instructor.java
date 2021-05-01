package HomeTasks.UcuncuGun;

public class Instructor extends User{
    String instructorDetails;
    String courseName;

    public Instructor() {
    }

    public Instructor(String instructorDetails, String courseName){
        this.instructorDetails=instructorDetails;
        this.courseName=courseName;
    }

    public String getInstructorDetails(){
        System.out.println("--- Egitmen hakkinda --- " + getFirstName()+" "+getLastName()+" -- \n");
        return "Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım.\n" +
                "Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım. Sırasıyla Başkent ve ODTÜ'de Yönetim\n" +
                "Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum. Profesyonel iş hayatıma\n" +
                "ise henüz üniversite birinci sınıftayken başladım.\n";
    }
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
