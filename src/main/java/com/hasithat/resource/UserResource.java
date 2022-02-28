package com.hasithat.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/all")
public class UserResource {

    //@Autowired
    private UserRepository usersRepository;

    public UserResource(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping("/")
    public List<User> all() {


        return usersRepository.findAll();
    }


    @PostMapping("/create")
    public List<User> users(@RequestBody User user) {
        //User user = new User();
        //user.setId(1);
        //user.setName("Sam");
        //user.setSalary(3400);
        //user.setTeamName("Development");

        usersRepository.save(user);

        return usersRepository.findAll();
    }
}
