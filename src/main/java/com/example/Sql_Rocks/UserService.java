package com.example.Sql_Rocks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    // Here Repository is an interface so how can we create an object of it?
    // Here we are not creating the object of the interface,
    //but the object of the class which is extending the interface will be created.
    //That class is simpleJpaRepository

    public String createUser(User user){

        userRepository.save(user);
        return "User added Successfully";
    }

    public User getUser(int id){

       return userRepository.findById(id).get();
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

}
