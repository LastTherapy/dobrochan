package com.dobrochan.chatapp.services;

import com.dobrochan.chatapp.model.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ListOperations;

import java.util.List;

@Service
public class ChatMessageService {

    private final ListOperations<String, ChatMessage> listOperations;
    private static final String MESSAGE_HISTORY_KEY = "chat:messages";

    @Autowired
    public ChatMessageService(RedisTemplate<String, ChatMessage> redisTemplate) {
        this.listOperations = redisTemplate.opsForList();
    }

    public void saveMessage(ChatMessage message) {
        listOperations.rightPush(MESSAGE_HISTORY_KEY, message);
    }

    public List<ChatMessage> getMessages() {
        return listOperations.range(MESSAGE_HISTORY_KEY, 0, -1);
    }
}
