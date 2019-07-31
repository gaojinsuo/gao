package com;

import com.gao.jin.aop.GreetingAdvisor;
import com.gao.jin.aop.GreetingBeforeAdvice;
import com.gao.jin.aop.Waiter;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Test;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import javax.xml.transform.Source;

public class AopTest {
//    static {
//        System.out.println("AOPTest");
//    }
//    @Test
//    public void test(){
//        ProxyFactory proxyFactory = new ProxyFactory();
//        Waiter waiter = new Waiter();
//        GreetingAdvisor greetingAdvisor= new GreetingAdvisor();
//        GreetingBeforeAdvice greetingBeforeAdvice =new GreetingBeforeAdvice();
//        proxyFactory.addAdvice((BeforeAdvice)greetingBeforeAdvice);
//        proxyFactory.setTarget(waiter);
//        proxyFactory.addAdvisors(greetingAdvisor);
//        Waiter waiterProxy = (Waiter) proxyFactory.getProxy();
//        waiterProxy.greetTo("gao");
//        waiterProxy.serveTo("jin");
//    }
    public void a(){
        System.out.println("a");
    };
}
