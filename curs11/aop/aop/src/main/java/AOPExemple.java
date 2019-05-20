import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AOPExemple {

//    @Pointcut("execution(* Student.display())")
//    public void searchMethods() {
//    }
//
//    @Before("searchMethods()")
//    public void before(JoinPoint jp) {
//        System.out.println("Numele metodei este: " + jp.getSignature().getName());
//    }

//    @Pointcut("execution(* Student.*(..))")
//    public void searchMethods() {
//    }
//
//    @After("searchMethods()")
//    public void after(JoinPoint jp) {
//        System.out.println("Sfarsitul metodei: " + jp.getSignature().getName());
//        System.out.println();
//    }

//    @Around("execution(* Student.*(..))")
//    public void around(ProceedingJoinPoint jp) {
//        System.out.println("Metoda: " + jp.getSignature().getName() + " cu " + jp.getArgs().length + " argumente");
//        try {
//            jp.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        System.out.println("Sfarsitul metodei: " + jp.getSignature().getName());
//        System.out.println();
//    }

//    @Pointcut("execution(* Student.*(String)) || execution(* Student.*(Integer))")
//    public void searchMethods() {}

    @Pointcut("execution(* Student.*(Integer))")
    public void searchMethod1() {}

    @Pointcut("execution(* Student.*(String))")
    public void searchMethod2() {}

    @Pointcut("searchMethod1() || searchMethod2()")
    public void searchMethods() {}


    @Around("searchMethods()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("Metoda: " + jp.getSignature().getName() + " cu " + jp.getArgs().length + " argumente");
        try { // facem try-catch sau punem la metoda throws Throwable
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
