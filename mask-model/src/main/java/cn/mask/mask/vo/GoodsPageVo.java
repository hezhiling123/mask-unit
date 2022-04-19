package cn.mask.mask.vo;

import cn.mask.mask.model.spec.SpecGoodsPrice;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GoodsPageVo implements Serializable {
    private GoodsBasePageVo base; //基础信息
    private List<SpecGoodsPrice> specGoodsPriceList;//规格价格
}
