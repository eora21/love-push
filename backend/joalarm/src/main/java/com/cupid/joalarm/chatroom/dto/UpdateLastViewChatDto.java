package com.cupid.joalarm.chatroom.dto;

import lombok.Data;

@Data
public class UpdateLastViewChatDto {
    private long accountSeq;
    private long chatroomSeq;
    private long chatSeq;
}
