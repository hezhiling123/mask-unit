package cn.mask.mask.model.user.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 验证码实体类，用于缓存验证码发送
 *
 * @author mask
 */
@Data
public class CaptchaItem {
    private String phoneNumber;
    private String code;
    private LocalDateTime expireTime;
}