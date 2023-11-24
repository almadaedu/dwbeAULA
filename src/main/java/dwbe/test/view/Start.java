package dwbe.test.view;

import dwbe.test.controller.HotelService;
import dwbe.test.controller.UserService;
import dwbe.test.model.Hotel;
import dwbe.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Start implements CommandLineRunner {
    @Autowired
    private final UserService service = new UserService();

    private final User user = new User();
    @Override
    public void run(String... args) throws Exception {
        service.gravar(new User("João", "jsilva", "12345"));

        ArrayList<User> listUsuarios = (ArrayList<User>) service.listar();
        for(User user: listUsuarios) {
            System.out.println(user.getName());
            System.out.println(user.getUsername());
            System.out.println(user.getPassword());
        }
    }


}
