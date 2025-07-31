package src;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "College Mathematics Calculator");
        model.addAttribute("description", "Advanced mathematical calculations with step-by-step solutions");
        return "index";
    }

    @GetMapping("/calculator")
    public String calculator(Model model) {
        model.addAttribute("title", "Basic Calculator");
        return "calculator";
    }

    @GetMapping("/calculus")
    public String calculus(Model model) {
        model.addAttribute("title", "Calculus Tools");
        return "calculus";
    }

    @GetMapping("/algebra")
    public String algebra(Model model) {
        model.addAttribute("title", "Algebra Solver");
        return "algebra";
    }

    @GetMapping("/matrix")
    public String matrix(Model model) {
        model.addAttribute("title", "Matrix Operations");
        return "matrix";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About");
        return "about";
    }
}