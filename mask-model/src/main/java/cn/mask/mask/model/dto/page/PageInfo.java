package cn.mask.mask.model.dto.page;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-12 19:40:05
 */
@Data
public class PageInfo implements Serializable {
    private static final long serialVersionUID = -8775198087164677206L;
    /**
     * 页数
     */
    @NotEmpty(message = "页数不可为空")
    private int pageNum;
    /**
     * 每页数量
     */
    @NotEmpty(message = "每页数量不可为空")
    private int pageSize;
    /**
     * 当前页数据量
     */
    private int size;
    /**
     * 开始行
     */
    private int startRow;
    /**
     * 结束行
     */
    private int endRow;
    /**
     * 页数
     */
    private int pages;
    /**
     * 数据量
     */
    private int recordCounts;
    /**
     * 前一页
     */
    private int prePage;
    /**
     * 后一页
     */
    private int nextPage;
    /**
     * 是否为第一页
     */
    private boolean isFirstPage = false;
    /**
     * 是否为最后一页
     */
    private boolean isLastPage = false;
    /**
     * 排序字段
     */
    private String orderField;
    /**
     * 排序类型
     */
    private String orderType;

    public PageInfo() {
    }
}
