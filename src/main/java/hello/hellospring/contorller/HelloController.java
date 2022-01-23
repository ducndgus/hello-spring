package hello.hellospring.contorller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") //hello 함수 부르기
    public String hello(Model model){
        model.addAttribute("data",  "hello!!");//키,데이터
        return "hello";//hello.html을 찾아서 간다
    }
}
