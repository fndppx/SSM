package dao;


import entity.User;

public interface UserDao {

    public User addUser(String username, String password);

}
