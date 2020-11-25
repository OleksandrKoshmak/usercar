import hibernateUtil.HibernateUtil;
import models.Auto;
import models.User;
import services.AutoService;
import services.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AutoService autoService = new AutoService();
        UserService userService = new UserService();
        Auto test = autoService.findAuto(4);
        autoService.deleteAuto(test);



    }
}
