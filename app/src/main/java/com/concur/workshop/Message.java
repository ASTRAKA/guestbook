package com.concur.workshop;

import javax.annotation.Nonnull;

public class Message {
    private String text;
    private String nickname;

    public Message(@Nonnull final String nickname, @Nonnull final String message) {
        this.nickname = nickname;
        this.text = message;
    }

    public final String getText() {
        return text;
    }

    public final String getNickname() {
        return nickname;
    }
}
