package mr.mbconsulting.Sygep.route;

import mr.mbconsulting.Sygep.entities.User;
import mr.mbconsulting.Sygep.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController

@RequestMapping("/users")
public class Users {

    @Autowired
    UserService userService;
    @CrossOrigin
    @PostMapping(value = "/signin", produces = {"application/json"})
    public ResponseEntity<Map> login(@RequestBody User user){
        System.out.println("User ---------------"+user.getUsername());
        Map<String, String> tokenMap = new HashMap<>();

        String token = userService.signin(user.getUsername(), user.getPassword());
        tokenMap.put("token", token);
        return ResponseEntity.ok(tokenMap);
    }

    @PostMapping("/add")
    @CrossOrigin
    public ResponseEntity addUser(@RequestBody User user){
        boolean isAdded =  userService.signup(user);
        return ResponseEntity.ok(isAdded);
    }
}
