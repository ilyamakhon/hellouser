package by.makhon.tat21;


public class MessageBuilder {

    public String buildMessage(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");

        for(String arg : args) {
            stringBuilder.append(arg).append(" ");
        }

        return stringBuilder.toString();
    }
}
