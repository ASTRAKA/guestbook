package com.concur.workshop;

import org.junit.Assert;
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

        String nickname = "foo";
        Message messageInstance = new Message(nickname, "bar");
        Assert.assertEquals("Test of nickname failed!", nickname, messageInstance.getNickname());

    }

    @Test
    public void testNicknameNegative() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Argument can't be null or empty");
        Message message = new Message(null, "bar");
    }

    @Test
    public void testTextPositive() {

        String message = "some message text";
        Message messageInstance = new Message("foo", message);
        Assert.assertEquals("Test of message failed!", message, messageInstance.getText());

    }

    @Test
    public void testTextNegative() {

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Argument can't be null or empty");
        Message message = new Message("foo", null);
    }
}
