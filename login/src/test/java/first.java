import com.zd.pojo.User;
import com.zd.service.Impl.UserServiceImpl;
import org.junit.Test;

public class first {
    UserServiceImpl userService =new UserServiceImpl();
    @Test
    public void login(){


        String password="17622338289";
        String username="duandingao";
        boolean b = userService.loginByUsernamePassword(username, password);
        System.out.println("b = " + b);
    }
    @Test
    public void enroll(){
        User user=new User();
        user.setUsername("duandingao");
        user.setPassword("123123123");
        user.setPhone("17622338289");
        userService.insertUser(user);

    }
}
