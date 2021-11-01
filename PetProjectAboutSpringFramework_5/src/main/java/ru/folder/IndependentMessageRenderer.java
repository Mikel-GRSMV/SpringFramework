package ru.folder;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependentMessageRenderer {
    @Autowired
    private MessageRendererInterface rendererInterface;

//    public IndependentMessageRenderer(MessageRendererInterface rendererInterface) {
//        this.rendererInterface = rendererInterface;
//    }

    public void print(){
        rendererInterface.printMsg();
    }
}
