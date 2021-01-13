package com.example.system.entity.dto.car;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description
 * @Author luckydddyf
 * @Date 2021-01-05 10:36
 */
@Data
public class CarInputDTO {

    @ApiModelProperty("汽车名称")
    private String name;

    @ApiModelProperty("汽车照片")
    private String photoUrl;

    @ApiModelProperty("租金")
    private Integer rent;

    @ApiModelProperty("状态")
    private Integer state;
}