package nextstep.helloworld.mvc.handler;

import nextstep.helloworld.mvc.domain.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/return-value")
public class ReturnValueController {

    @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String string() {
        return "message";
    }
    
    @GetMapping(path = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public User responseBodyForUser() {
        return new User("name", "email");
    }
    
    @GetMapping(path = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntity(@PathVariable Long id) {
        return ResponseEntity.ok(new User("name", "email"));
    }
    
    @GetMapping(path = "/members", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity responseEntityFor400() {
        return ResponseEntity.badRequest().build();
    }
    
    @GetMapping(path = "/thymeleaf", produces = MediaType.TEXT_HTML_VALUE)
    public String thymeleaf() {
        return "sample";
    }
}