package ru.idarenin.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import ru.idarenin.listener.stream.ConsumerChannels;

@SpringBootApplication
@EnableBinding(ConsumerChannels.class)
public class ListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListenerApplication.class, args);
	}

}
