package cn.mask.mask.model.base.mvc;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.model.dto.page.PageInfo;
import cn.mask.mask.model.dto.page.PageResult;
import cn.mask.mask.model.utils.ObjectConversionUtil;
import com.github.pagehelper.PageHelper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2023-02-20 21:43:29
 */
public interface BaseMapper {
    /**
     * 开始分页
     * @param pageParam {@link PageInfo} 分页信息
     */
    default void beginPager(PageInfo pageParam) {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), true);
    }

    /**
     * 结束分页
     *
     * @param list 需封装为{@link cn.mask.mask.model.dto.page.PageResult}
     * @param <T> 数据泛型
     * @return  分页数据
     */
    default <T> PageResult<T> endPager(List<T> list) {
        PageResult<T> page = new PageResult<>();
        com.github.pagehelper.PageInfo<T> appsPageInfo = new com.github.pagehelper.PageInfo<>(list);
        page.setData(appsPageInfo.getList());
        page.setPageNum(appsPageInfo.getPageNum());
        page.setPageSize(appsPageInfo.getPageSize());
        page.setSize(appsPageInfo.getSize());
        page.setStartRow(appsPageInfo.getStartRow());
        page.setEndRow(appsPageInfo.getEndRow());
        page.setPages(appsPageInfo.getPages());
        page.setFirstPage(appsPageInfo.isIsFirstPage());
        page.setLastPage(appsPageInfo.isIsLastPage());
        page.setRecordCounts(Integer.parseInt(String.valueOf(appsPageInfo.getTotal())));
        return page;
    }

    /**
     * 结束分页
     *
     * @param list 需封装为{@link cn.mask.mask.model.dto.page.PageResult}
     * @param <T> 数据泛型
     * @param clazz {@link Class} 需转换的数据类型
     * @return  分页数据
     */
    default <T, S> PageResult<S> endPager(List<T> list, Class<S> clazz) {
        PageResult<T> tPage = this.endPager(list);
        List<S> sList = tPage.getData().stream().map((t) -> {
            try {
                return ObjectConversionUtil.convert(clazz.newInstance(), t);
            } catch (MaskException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
        PageResult<S> sPage = new PageResult<>();
        sPage.setData(sList);
        sPage.setPageNum(tPage.getPageNum());
        sPage.setPageSize(tPage.getPageSize());
        sPage.setSize(tPage.getSize());
        sPage.setStartRow(tPage.getStartRow());
        sPage.setEndRow(tPage.getEndRow());
        sPage.setPages(tPage.getPages());
        sPage.setFirstPage(tPage.isFirstPage());
        sPage.setLastPage(tPage.isLastPage());
        sPage.setRecordCounts(tPage.getRecordCounts());
        return sPage;
    }
}
