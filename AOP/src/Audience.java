/**
 * Created by YanMing on 2017/2/21.
 */
import org.aspectj.lang.annotation.*;

//@Aspect
public class Audience {
    public Audience(){}

    //@Pointcut("execution(* *.perform(..))")
    public void performance(){}

   // @Before("performance()")
    public void takeSeats(){
        System.out.println("I'm taking seat");
    }

   //@Before("performance()")
    public void turnOffPhone(){
        System.out.println("I'm turing off my phone");
    }

  // @AfterReturning("performance()")
    public void applaud(){
        System.out.println("Claping...PA PA PA PA PA PA PA PA");
    }

  // @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Boo! I want my money back!");
    }
}
