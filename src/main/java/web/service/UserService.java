package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.model.User;

import java.util.List;

public interface UserService extends UserDetailsService{

    List<User> listOfUsers();

    void addUser(User user);

    void deleteUser(Long id);

    void editUser(Long id, User user);
}
