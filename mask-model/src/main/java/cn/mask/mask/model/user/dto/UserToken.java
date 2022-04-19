package cn.mask.mask.model.user.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author mask
 */
@Data
public class UserToken {
    private Integer userId;
    private String token;
    private String sessionKey;
    private LocalDateTime expireTime;
    private LocalDateTime updateTime;
}
