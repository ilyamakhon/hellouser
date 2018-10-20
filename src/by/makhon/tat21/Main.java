package by.makhon.tat21;

public class Main {

    public static void main(String[] args) {
        MessageBuilder messageBuilder = new MessageBuilder();
        MessageWriter messageWriter = new MessageWriter();

        String response = messageBuilder.buildMessage(args);
        messageWriter.printMessage(response);
    }
}
