package sun.service;

import sun.entity.User;

import java.util.List;

public interface IUserService {

    User findById(Long id);

    List<User> findAll();

    int insert(User user);
}
