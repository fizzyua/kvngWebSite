package app.controller;


/*import app.service.order.OrderService;*/
import app.entity.Item;
import app.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class MainController {
    @Autowired
    private ItemService itemService;



    @RequestMapping("/")

    public String index(@RequestParam(name="page", required=false, defaultValue="0") String page,
                        @RequestParam(name= "filter",required=false, defaultValue="0") String filter,
                        ModelMap model) {
        if (Integer.parseInt(page) < 0) page = "0";
        if (filter.equals("0")) {
            PageRequest page_req = new PageRequest(Integer.parseInt(page), 5, Sort.Direction.DESC, "id");
            List<Item> items = itemService.getPagingListOfItems(page_req);
            model.put("items",items);
        }
        else {
            PageRequest page_req = new PageRequest(Integer.parseInt(page), 5, Sort.Direction.DESC, "id");
            List<Item> items= itemService.getPagingListOfItemsByFilters(page_req,filter);
            model.put("items",items);
        }
        return "index";
    }

}
