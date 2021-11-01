package ru.folder;

public class MessageRenderer implements MessageRendererInterface{
    //private String messageText;
    private Message message;

//    public MessageRenderer(String messageText) {
//        this.messageText = messageText;
//    }


    public MessageRenderer(Message message) {
        this.message = message;
    }

    @Override
    public void printMsg() {
        System.out.println(message.getText());
    }
    //    public void printMSG(){
////        System.out.println(messageText);
//        System.out.println(message.getText());
//    }
}
