package ru.dobrochan.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "messages")
public class TelegramMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private TelegramUser user;

    @ManyToOne
    private TelegramChat chat;

    @Column
    private String text;

    @Column
    private long date;

    @Column
    private String caption;


}
