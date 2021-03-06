package com.example.system.entity.dto.gift;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author luckydddyf
 * @Date 2021-01-13 10:12
 */
@Data
public class FrontGiftItemDTO {

    @ApiModelProperty("套餐id")
    private Integer id;

    @ApiModelProperty("套餐名称")
    private String name;

    @ApiModelProperty("套餐描述")
    private String desc;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty("开始时间")
    private Date startTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty
    private Date endTime;

}
