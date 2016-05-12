package com.concur.workshop;

import org.junit.Test;

/**
 * @author AndrejS
 */
public class MessageTest {

    @Test
    public void testNicknamePositive() {

        Message message = new Message("foo", "bar");
    }

    @Test
    public void testNicknameNegative() {

        Message message = new Message(null, null);
    }

    @Test
    public void testTextPositive() {
    }

    @Test
    public void testTextNegative() {
    }
}
