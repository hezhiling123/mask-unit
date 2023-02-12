package cn.mask.mask.model.dto.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-12 19:43:29
 */
@Data
public class PageResult<T> implements Serializable {
    private static final long serialVersionUID = -1852411356833237829L;
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 页大小
     */
    private int pageSize;
    /**
     * 总页数
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
     * 记录数
     */
    private int recordCounts;
    /**
     * 是否为第一页
     */
    private boolean isFirstPage = false;
    /**
     * 是否为最后一页
     */
    private boolean isLastPage = false;
    /**
     * 数据
     */
    private List<T> data;
}
