package cn.mask.mask.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-25 23:08:01
 */
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class BasePO {
    private String crterId;
    private String crterName;
    private Date crteTime;
    private String updterId;
    private String updterName;
    private Date updtTime;

    public String getCrterId() {
        return crterId;
    }

    public void setCrterId(String crterId) {
        this.crterId = crterId == null ? null : crterId.trim();
    }

    public String getCrterName() {
        return crterName;
    }

    public void setCrterName(String crterName) {
        this.crterName = crterName == null ? null : crterName.trim();
    }

    public Date getCrteTime() {
        return crteTime;
    }

    public void setCrteTime(Date crteTime) {
        this.crteTime = crteTime;
    }

    public String getUpdterId() {
        return updterId;
    }

    public void setUpdterId(String updterId) {
        this.updterId = updterId == null ? null : updterId.trim();
    }

    public String getUpdterName() {
        return updterName;
    }

    public void setUpdterName(String updterName) {
        this.updterName = updterName == null ? null : updterName.trim();
    }

    public Date getUpdtTime() {
        return updtTime;
    }

    public void setUpdtTime(Date updtTime) {
        this.updtTime = updtTime;
    }
}
