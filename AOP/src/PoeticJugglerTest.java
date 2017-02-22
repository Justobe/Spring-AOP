import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by YanMing on 2017/2/21.
 */
public class PoeticJugglerTest {
    @Test
    public void testunit() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }

}