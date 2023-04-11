package nextstep.helloworld.mvc.mapping;

import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {
    
    @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> message() {
        return ResponseEntity.ok().body("message");
    }
    
    @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE, params = "name=hello")
    public ResponseEntity<String> messageForParam() {
        return ResponseEntity.ok().body("hello");
    }
    
    @GetMapping(path = "/message", produces = MediaType.APPLICATION_JSON_VALUE, headers = "HEADER=hi")
    public ResponseEntity<String> messageForHeader() {
        return ResponseEntity.ok().body("hi");
    }
}