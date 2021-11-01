package ru.folder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ru.folder\\context.xml");
        //MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");

//        MessageRendererInterface rendererInterface = (MessageRendererInterface) context.getBean("renderer");
//        rendererInterface.printMsg();

        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
