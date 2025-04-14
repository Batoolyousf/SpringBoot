package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080
@RestController
@RequestMapping("/api")
//http://localhost:8080/api
public class TestingController {
    //http://localhost:8080/api/name
    @GetMapping("/name")
    public String getName(){
        return "I am Batool yousef";
    }

    //http://localhost:8080/api/age
    @GetMapping("/age")
    public String getAge(){
        return "26";
    }

    //http://localhost:8080/api/phone
    @GetMapping("/phone")
    public String getPhone(){
        return "34667111";
    }

    //http://localhost:8080/api/address
    @GetMapping("/address")
    public String getAddress(){
        return "alll";
    }

    //http://localhost:8080/api/num
    @GetMapping("/num")
    public String getNum(){
        return "234";
    }

    //http://localhost:8080/api/id
    @GetMapping("/id")
    public String getId(){
        return "1998";
    }


}
