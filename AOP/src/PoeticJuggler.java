/**
 * Created by YanMing on 2017/2/21.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(){}

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags,Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        System.out.print("While reciting");
        poem.recite();
    }

}
