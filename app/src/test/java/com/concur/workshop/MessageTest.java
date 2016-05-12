package com.concur.workshop;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author AndrejS
 */
public class MessageTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

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
