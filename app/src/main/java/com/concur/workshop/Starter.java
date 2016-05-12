package com.concur.workshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starter {
    private static final Logger logger = LoggerFactory.getLogger(Starter.class);

    public static void main(String[] args) {
        JettyServer jettyServer = null;

        MessageStore store = new MessageStore();
        store.addMessage(new Message("test adsa", "Hello world!"));
        store.addMessage(new Message("Barbucha", "foo bar bar"));

        try {
            jettyServer = new JettyServer();
            jettyServer.start();
            jettyServer.join();
        } catch (Exception ex) {
        } finally {
            if (jettyServer != null) {
                try {
                    jettyServer.stop();
                    jettyServer.destroy();
                } catch (Exception ex) {
                    logger.warn("Unable to stop jetty server properly.", ex);
                }
            }
        }
    }
}
