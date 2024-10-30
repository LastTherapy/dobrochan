package com.dobrochan.chatapp.config;

import com.dobrochan.chatapp.model.ChatMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, ChatMessage> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, ChatMessage> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);

        // Устанавливаем сериализаторы для ключей и значений
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        return template;
    }
}