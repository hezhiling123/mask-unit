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
    private String crtorId;
    private String crtorName;
    private Date crteTime;
    private String updterId;
    private String updterName;
    private Date updtTime;

    public String getCrtorId() {
        return crtorId;
    }

    public void setCrtorId(String crtorId) {
        this.crtorId = crtorId == null ? null : crtorId.trim();
    }

    public String getCrtorName() {
        return crtorName;
    }

    public void setCrtorName(String crtorName) {
        this.crtorName = crtorName == null ? null : crtorName.trim();
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
