# guestbook
czechitas workshop

gradlew clean install


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
