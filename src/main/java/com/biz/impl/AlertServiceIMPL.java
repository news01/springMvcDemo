package com.biz.impl;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import com.biz.AlertService;
import com.pojo.WxAccount;

@Component
public class AlertServiceIMPL implements AlertService {

	private JmsOperations jmsOperation;

	private final static String URL = "tcp://127.0.0.1:61616";
	private final static String QUEUE_NAME = "queue-test";

	@Autowired
	public AlertServiceIMPL(JmsOperations jmsOperations) {
		this.jmsOperation = jmsOperations;
	}

	@Override
	public void sendSpittleAlert(final WxAccount account) {
		jmsOperation.send(new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {

				return session.createObjectMessage((Serializable) account);
			}
		});
//		jmsOperation.convertAndSend(account);

	}

}
