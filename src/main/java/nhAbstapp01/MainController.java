package nhAbstapp01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private MybatisRepository mybatisRepository;

    public MainController(MybatisRepository mybatisRepository) {
        this.mybatisRepository = mybatisRepository;
    }

    @GetMapping("/index")
    public String index() {
        return "hello";
    }

    @GetMapping("/abst")
    public void main() throws Exception {
        List<BoardMybatis> all = mybatisRepository.findAll();
        for (BoardMybatis a : all) {
            System.out.println(a.getId() + ", "+ a.getName());
        }
    }
}
