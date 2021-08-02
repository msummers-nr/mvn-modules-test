package org.springframework.cloud.stream.app.file.sink;

import org.springframework.integration.handler.AbstractReplyProducingMessageHandler;
import org.springframework.messaging.Message;
//import org.springframework.integration.support.management.ManageableLifecycle;
//import org.springframework.integration.handler.MessageTriggerAction;

public class MyMessageHandler extends AbstractReplyProducingMessageHandler /*implements ManageableLifecycle, MessageTriggerAction*/ {
	
	@Override
	protected Object handleRequestMessage​(Message<?> requestMessage) {
		System.out.println("======================================================");
		System.out.println("---------> handleRequestMessage​");
		System.out.println(requestMessage);
		System.out.println("======================================================");
		return null;
	}

}