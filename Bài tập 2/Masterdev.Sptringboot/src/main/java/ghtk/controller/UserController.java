package ghtk.controller;

import ghtk.exception.FoundException;
import ghtk.model.User;
import ghtk.repository.UserRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/users")

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List getAlluser(){

        return userRepository.findAll();
    }
    @GetMapping("{id}")
    public ResponseEntity<User> getUserId(@PathVariable long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new FoundException("id not found"));
        return ResponseEntity.ok(user);

    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User UserInfor){
        User updateUser = userRepository.findById(id).orElseThrow(() -> new FoundException("not found Id"));
        updateUser.setEmail(UserInfor.getEmail());
        updateUser.setPassword(UserInfor.getPassword());
        userRepository.save(updateUser);
        return ResponseEntity.ok(updateUser);
    }
    @DeleteMapping("{id}")
    public  ResponseEntity<User> deleteUser(@PathVariable long id){
        User deleteUser = userRepository.findById(id).orElseThrow(() -> new FoundException("not found id") );
        userRepository.delete(deleteUser);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
