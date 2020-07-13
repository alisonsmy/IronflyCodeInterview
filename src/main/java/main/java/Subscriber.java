package main.java;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.*;
import java.util.*;

public class Subscriber{

    private static final Logger logger = LoggerFactory.getLogger(Subscriber.class);

    private Connection connection;
    private Session session;

    public void create(String clientId) throws Exception {
        // create a Connection Factory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);

        // create a Connection
        connection = connectionFactory.createConnection();
        connection.setClientID(clientId);

        // create session
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        //create subscriber

        //start the connection

        //try to subscribe

        //if exception occurs, throw exception. Otherwise, print out <stock> subscribed successfully.

        //close the connection


    }

    public void unsubscribe(List stocks) throws Exception {
        //try to unsubscribe
        //if exception occurs, throw exception. Otherwise, print out <stock> unsubscribed successfully

    }
}
