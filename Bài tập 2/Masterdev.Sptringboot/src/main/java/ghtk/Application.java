package ghtk;

import ghtk.model.User;
import ghtk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setEmail("quanghuy");
        user.setPassword("1223");
        userRepository.save(user);

        User user2 = new User();
        user2.setEmail("quanghuy");
        user2.setPassword("1223");
        userRepository.save(user2);

        User user1 = new User();
        user1.setEmail("quanghuy");
        user1.setPassword("1223");
        userRepository.save(user1);
    }
}
