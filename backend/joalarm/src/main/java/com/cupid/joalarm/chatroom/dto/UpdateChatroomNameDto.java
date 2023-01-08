package com.cupid.joalarm.chatroom.dto;

import lombok.Data;

@Data
public class UpdateChatroomNameDto {
    private long accountSeq;
    private long chatroomSeq;
    private String name;
}
