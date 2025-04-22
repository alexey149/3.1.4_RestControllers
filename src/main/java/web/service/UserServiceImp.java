package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}