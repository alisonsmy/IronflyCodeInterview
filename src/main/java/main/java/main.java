package main.java;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.*;

public class main {
    public static void main(String args[]) throws Exception {
        //example of stock list that wants to be subscribed
        List<String> stocks = new ArrayList<String>();
        stocks.add("stock 1");
        stocks.add("stock 2");
        stocks.add("stock 3");


    }



}
