package com.strong.fee.util.jmockit;


import com.strong.fee.util.jmockit.service.InterfaceWithDefault;
import com.strong.fee.util.jmockit.service.InterfaceWithDefaultImpl;
import com.strong.fee.util.jmockit.service.UserInterface;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author: 小殊
 * create: 2018/7/23 下午2:16
 */
public class JmockitTest {

    private Logger logger = LoggerFactory.getLogger(JmockitTest.class);

    @Test
    public void test001(@Mocked InterfaceWithDefault mock) {
        new Expectations() {{
            mock.fun();
            result = 3;
            mock.defaultInt();
            result = 4;
        }};

        logger.info("{}", mock.fun());

        logger.info("{}", mock.defaultInt());

        logger.info("{}", mock.add());


        UserInterface userInterface = new UserInterface(new InterfaceWithDefaultImpl());

        logger.info("{}", userInterface.add());
    }

    @Test
    public void test002(@Mocked InterfaceWithDefaultImpl mock) {

        logger.info("{}", mock.fun());

        logger.info("{}", mock.defaultInt());
        logger.info("{}", mock.add());
        new Expectations() {{
            mock.fun();
            result = 3;
            mock.defaultInt();
            result = 4;
        }};

        logger.info("{}", mock.fun());

        logger.info("{}", mock.defaultInt());

        logger.info("{}", mock.add());


        UserInterface userInterface = new UserInterface(new InterfaceWithDefaultImpl());

        logger.info("{}", userInterface.add());


    }

    @Test
    public void test003() {
        InterfaceWithDefaultImpl mock = new InterfaceWithDefaultImpl();
        logger.info("{}", mock.add());
        new Expectations(InterfaceWithDefaultImpl.class) {{
            mock.fun();
            result = 3;
            mock.defaultInt();
            result = 4;
        }};

        logger.info("{}", mock.fun());

        logger.info("{}", mock.defaultInt());

        logger.info("{}", mock.add());

        UserInterface userInterface = new UserInterface(new InterfaceWithDefaultImpl());

        logger.info("{}", userInterface.add());


    }

    @Test
    public void test004(@Mocked InterfaceWithDefault mock) {
        new Expectations() {{
            mock.fun();
            result = 3;
            mock.defaultInt();
            result = 4;
        }};


        UserInterface userInterface = new UserInterface(new InterfaceWithDefaultImpl());


        logger.info("{}", mock.fun());

        logger.info("{}", mock.defaultInt());

        logger.info("{}", mock.add());
        logger.info("{}", userInterface.add());
    }


    @Test
    public void test005() {
        test5fun(true);
    }

    @Test
    public void test006() {
        test5fun(false);
    }

    private A test5fun(boolean b) {
        try {
            if (b) {
                return new A(1);
            } else {
                throw new Exception();
            }
        } catch (Exception ex) {
            return new A(2);
        } finally {
            logger.info("finally");
        }
    }

    class A {
        public A(Integer i) {
            logger.info("A" + i);
        }
    }

}
