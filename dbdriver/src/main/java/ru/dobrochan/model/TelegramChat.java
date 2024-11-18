package ru.dobrochan.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "chats")
@Data
public class TelegramChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
