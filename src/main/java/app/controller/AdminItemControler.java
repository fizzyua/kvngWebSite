package app.controller;


import app.entity.Item;
import app.service.coder.CoderService;
import app.service.item.ItemService;
import app.service.item.ItemServiceImpl;
import app.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class AdminItemControler {

    @Autowired
    private UserService userService;
    @Autowired
    private ItemService itemService;

    @Autowired
    private CoderService coderService;



    @RequestMapping("/admin_add_item")
    public String adminSite(Model model) {
        return "admin_add_item";
    }


    @RequestMapping(value = "/addItem")
    public String addItem(ItemServiceImpl item, Model model) {
        model.addAttribute("Item", item);
        System.out.println(item);
        return "redirect:/";
    }





}
