/**
 * Created by YanMing on 2017/2/21.
 */
public class Sonnet29 implements Poem{
    private static String [] Lines ={
            "When in disgrace with fortune and men's eyes",
            "I all alone beweep my outcast state",
            "And trouble deaf heaven with my bootless cries",
            "And look upon myself, and curse my fate..."
    };

    public Sonnet29(){}

    public void recite(){
        for(int i = 0 ; i < Lines.length;i++)
        {
            System.out.println(Lines[i]);
        }
    }
}
