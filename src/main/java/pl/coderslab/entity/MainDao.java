package pl.coderslab.entity;


public class MainDao {
    public static void main(String[] args) {
        User user1=new User(1,"Filip","f.mazur@interia.pl","kasztany123");
        User user2=new User(2,"Janek","j.mazurek@interia.pl","kasztany1234");
        User user3=new User(4,"Mareczek","m.mareczek@gmail.com","banany1234");
        User user4=new User(4,"Franek","f.frankowski@gmail.com","fr1234");
        User user5=new User("Pawel","p.jumper@interia.pl","rzeczywiscie1234");
        User user6=new User("Krzysztof","krzy.krzysztof@gmail.com","krzys1234");


//      UserDao.create(user6));
//        System.out.println(UserDao.read(1));


//        User userToUpdate=UserDao.read(5);
//        userToUpdate.setUserName("NOWY_USER");
//        userToUpdate.setEmail("NOWY_USER@GMAIL.COM");
//        userToUpdate.setPassword("newnew");
//        UserDao.update(userToUpdate);
//        UserDao.delete(4);
        System.out.println(UserDao.findAll());
//        System.out.println(user6.getId());
//        System.out.println(user6.getUserName());
//        System.out.println(user6.getEmail());
//        System.out.println(user6.getPassword());
    }
}
