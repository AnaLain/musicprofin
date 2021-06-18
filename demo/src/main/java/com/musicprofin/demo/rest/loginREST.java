package com.musicprofin.demo.rest;


//import com.musicprofin.demo.entitys.login;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
public class loginREST {

        
    /*@GetMapping
    public ResponseEntity<login> getlogin(){
        login Login = new login();
        Login.setId_login(1L);
        Login.setRut_login("log1");
        Login.setContrasena_login("log1");
        return ResponseEntity.ok(Login);
    }*/
    
    /*@Autowired
    private loginDAO logDao;

    @GetMapping//actualice producto con BD
    public ResponseEntity<List<login>> getRut_login(){
        List<login> products =logDao.findAll();
        return ResponseEntity.ok(login);

    }*/

    //@GetMapping//localhost:7888
    //@RequestMapping(value="hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello world";
    }
}
