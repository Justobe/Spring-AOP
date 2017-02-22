import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by YanMing on 2017/2/21.
 */

public class AudienceAdvice  implements MethodBeforeAdvice,AfterReturningAdvice,ThrowsAdvice{
    private Audience audience;
    public AudienceAdvice(){}

    public void before(Method method,Object[]args,Object target) throws Throwable{
            audience.takeSeats();
            audience.turnOffPhone();
    }

    public void afterReturning(Object returnValue,Method method,Object[]args,Object target) throws Throwable{
        audience.applaud();
    }

    public void afterThrowing(Throwable throwable){
        audience.demandRefund();
    }

    public void setAudience(Audience audience){
        this.audience = audience;
    }
}
