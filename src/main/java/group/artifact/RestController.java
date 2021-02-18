package group.artifact;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping(path="/")
    String foo(){
        return "hello";
    }
}
