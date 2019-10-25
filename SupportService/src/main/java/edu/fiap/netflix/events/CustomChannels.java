package edu.fiap.netflix.events;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomChannels {
	@Input("inboundTicketAlert")
	SubscribableChannel tickets();
}