package aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AOP测试启动类.
 *
 * @author skywalker
 */
public class Bootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SimpleAopBean bean = context.getBean(SimpleAopBean.class);
        bean.boo();
        System.out.println(bean.getClass().getSimpleName());


        SimpleChildAopBean bean2 = context.getBean(SimpleChildAopBean.class);
        bean2.boo();
        bean2.testC();
        System.out.println(bean2.getClass().getSimpleName());
    }

}
