package HomeTasks.UcuncuGun;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String adress;

    public User(){

    }

    public User(int id,String firstName,String email,String password,String adress){
        super();
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
