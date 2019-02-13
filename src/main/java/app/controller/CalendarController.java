package app.controller;


/*import app.service.order.OrderService;*/
import app.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CalendarController {

    @RequestMapping("/calendar")
    public String index(/*Model model*/) {
        /*model.addAttribute("sum" , orderService.getSum());*/
        return "calendar";
    }
}
