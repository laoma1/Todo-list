package hello;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{
     static Map <Long,User> users= Collections.synchronizedMap(new HashMap<>());

@RequestMapping(value="/api/tasks",method=RequestMethod.GET)
     public List<User> getUserList(){
    List<User> r=new ArrayList(users.values());
        return r;
     }
@RequestMapping(value="/api/tasks",method=RequestMethod.POST)
     public String postUser(@ModelAttribute User user){
        users.put(user.getId(),user);
        return "OK";
     }
@RequestMapping(value="/api/tasks/{id}",method=RequestMethod.GET)
     public User getUser(@PathVariable Long id){
      return users.get(id);
     }
@RequestMapping(value="/api/tasks/{id}",method=RequestMethod.DELETE)
     public String deleteUser( @PathVariable Long id){
         users.remove(id);
         return "OK";
     }
 }
