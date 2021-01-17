package ru.idarenin.listener.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerChannels {
    String BROADCASTS = "broadcasts";

    @Input(BROADCASTS)
    SubscribableChannel broadcasts();
}
