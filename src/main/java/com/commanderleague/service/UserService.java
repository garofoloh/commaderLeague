package com.commanderleague.service;

import com.commanderleague.dto.CreateUserRequest;
import com.commanderleague.models.User;
import com.commanderleague.repositoryes.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {

    private final UserRepository userRepository;
    //private final RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
                       //RoleRepository roleRepository
        this.userRepository = userRepository;
        //this.roleRepository = roleRepository;
        //createRole();
    }

    /*private void createRole() {
        roleRepository.save(new Role("ADMIN"));
    }*/

    public User findUserNumber_DCI(String number_DCI) {
        return userRepository.findByNumber_DCI(number_DCI);
    }

    public User saveUser(CreateUserRequest request) {
        User user = new User();
        user.setNumber_DCI(request.getNumber_DCI());
        user.setName(request.getName());
        user.setNameUser(request.getNameUser());
        user.setPassword(request.getPassword());
        user.setActive(1);
        return userRepository.save(user);
    }

    /*public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByEmail(loginRequest.getUser());
        if(user == null){
            throw new SystemLoginException("");
        }else if(user.getPassword().equals(loginRequest.getPassword())){
            return new LoginResponse(user.getName(),user.getRoles());
        }
        throw new SystemLoginException("");
    }*/
}