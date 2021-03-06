package com.cz.item.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.cz.common.base.BaseModel;
import lombok.*;

import java.util.List;


/**
 * Created by jomalone_jia on 2017/9/15.
 */
@TableName("sys_item")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Item extends BaseModel<Item>{
    private String name;
    @TableField(value = "category_id")
    private Long categoryId;
    private Integer price;
    private Integer postFee;
    private String image;
    @TableField(exist = false)
    private Category category;
    @TableField(exist = false)
    private List<String> shownImages;
    @TableField(exist = false)
    private List<Param> params;
    private String describe;
    private String content;
}
