package app;


import app.entity.CustomUser;
import app.entity.ItemLink;
import app.entity.Item;
import app.entity.enums.UserRole;
import app.service.coder.CoderService;
import app.service.coder.CoderServiceImpl;
import app.service.item.ItemService;
import app.service.member.MemberService;
import app.service.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Kiev"));
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserService userService, final ItemService itemService, final MemberService memberService) {
        return new CommandLineRunner() {

            @Override
            public void run(String... strings) throws Exception {
                userService.addUser(new CustomUser("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.ADMIN));
                CoderService cs = new CoderServiceImpl();
                CustomUser user = new CustomUser("user",cs.coderSHA1("user"),UserRole.ADMIN);
                userService.addUser(user);;
                List<ItemLink> images = new ArrayList<>();
                images.add(new ItemLink("piactures/1.jpg"));
                images.add(new ItemLink("piactures/2.jpg"));
                Item item = new Item("title","text","bla-bla-bla-bla",images);
                itemService.addItem(item);
                List<ItemLink> images2 = new ArrayList<>();
                images2.add(new ItemLink("piactures/3.jpg"));
                images2.add(new ItemLink("piactures/4.jpg"));
                Item items = new Item("title1","text1","bla1-bla1-bla1-bla1",images2);
                itemService.addItem(items);
            }
        };
    }
}