package edu.miu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.time.Instant;

@AllArgsConstructor
@Data
@RedisHash("OffensiveWordsLog")
public class OffensiveWordsLog implements Serializable {
    private String id;
    private long userId;
    private int requestCount;
    private Instant updatedAt;
}
