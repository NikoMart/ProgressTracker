package progressTracker;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import progressTracker.controller.ProgressController;
import progressTracker.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private UserController userController;
    @Autowired
    private ProgressController progressController;

    @Test
    public void userControllerContextLoads() throws Exception {
        assertThat(userController).isNotNull();
    }

    @Test
    public void progressControllerContextLoads() throws Exception {
        assertThat(progressController).isNotNull();
    }
}