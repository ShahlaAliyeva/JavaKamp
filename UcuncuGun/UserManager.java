package HomeTasks.UcuncuGun;

public class UserManager {
    public void addUser(User user) {
        System.out.println("Kisi Eklendi : " + user.getFirstName()+" "+user.getLastName());
    }

    public void removeUser(User user) {
        System.out.println("Kisi Silindi : " + user.getFirstName() +" "+ user.getLastName());
    }

    public void updateUser(User user) {
        System.out.println("Kisi Güncellendi : " + user.getFirstName()+" "+user.getLastName());
    }
}
