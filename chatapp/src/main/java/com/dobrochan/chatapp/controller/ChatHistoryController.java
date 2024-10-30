package com.dobrochan.chatapp.controller;

import com.dobrochan.chatapp.model.ChatMessage;
import com.dobrochan.chatapp.services.ChatMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatHistoryController {

    private final ChatMessageService chatMessageService;

    @Autowired
    public ChatHistoryController(ChatMessageService chatMessageService) {
        this.chatMessageService = chatMessageService;
    }

    @RequestMapping("/messages")
    public List<ChatMessage> getMessages() {
        return chatMessageService.getMessages();
    }
}
