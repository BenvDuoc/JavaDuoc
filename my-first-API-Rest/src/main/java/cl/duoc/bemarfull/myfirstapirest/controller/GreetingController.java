package cl.duoc.bemarfull.myfirstapirest.controller;

import cl.duoc.bemarfull.myfirstapirest.controller.response.GreetingResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping("/hello")

    public ResponseEntity<GreetingResponse> hello() {
        var response = new GreetingResponse();
        response.setGreeting("Hello World");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/bye")
    public String bye(){

        return "Bye World";
    }


    @GetMapping("hello-guest")
    public ResponseEntity<GreetingResponse> helloGuest (@RequestParam
            (required = false, value = "name") String name, @RequestParam
            (required = false, value = "lastname") String lastName){
        var response = new GreetingResponse();
        response.setGreeting("Hello "+ name +" "+ lastName);
        return ResponseEntity.ok(response);
    }










}
