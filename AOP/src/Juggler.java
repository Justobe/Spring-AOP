/**
 * Created by YanMing on 2017/2/21.
 */
import org.junit.Test;
public class Juggler implements Performer {
    private int beanBags;

    public Juggler(){}

    public void setBeanBags(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public Juggler(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("Perform staring");
    }
}
