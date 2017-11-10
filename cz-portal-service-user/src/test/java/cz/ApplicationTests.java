package cz;

import com.cz.user.domain.User;
import com.cz.user.mapper.UserMapper;
import com.cz.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = com.cz.user.UserApplication.class)
public class ApplicationTests {

    /*@Autowired
    private UserMapper userMapper;*/

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user = new User();
        user.setEmail("aluba");
        userService.insert(user);
    }
}