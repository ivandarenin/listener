package ru.idarenin.listener.stream;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageListener {

    private final Logger logger = Logger.getLogger(this.getClass());

    @StreamListener(ConsumerChannels.BROADCASTS)
    public void broadcasted(String message) {
        System.out.println("Broadcasted: " + message);
        logger.debug("Broadcasted: " + message);
    }
}
