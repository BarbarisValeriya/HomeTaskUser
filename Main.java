package homework;

public class Main{
    public static void main(String[] args){

        User user = new User("Bobby");
        System.out.println(user);

        user.report(user.toString());
        user.save(user.toString());
    }
}