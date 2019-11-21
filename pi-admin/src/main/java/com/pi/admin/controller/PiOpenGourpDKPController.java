package com.pi.admin.controller;

import com.pi.admin.model.dto.UmsAdminLoginParam;
import com.pi.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gturn
 * @Title: PiOpenGourpDKPController
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 10:03
 */
@RestController
@Api(tags = "PiOpenGourpDKPController", description = "开团dkp管理api")
@RequestMapping("/wowGroup")
public class PiOpenGourpDKPController {
    @ApiOperation(value = "开团-设置团DKP规则")
    @RequestMapping(value = "/openDkpGroup", method = RequestMethod.POST)
    public CommonResult openDkpGroup() {

        return null;
    }

    @ApiOperation(value = "修改团-设置团DKP规则")
    @RequestMapping(value = "/updateDkpGroup", method = RequestMethod.POST)
    public CommonResult updateDkpGroup() {

        return null;
    }

    @ApiOperation(value = "删除团-设置团DKP规则")
    @RequestMapping(value = "/delDkpGroup", method = RequestMethod.POST)
    public CommonResult delDkpGroup() {

        return null;
    }

    @ApiOperation(value = "查看我开的团")
    @RequestMapping(value = "/QueryDkpGroup", method = RequestMethod.POST)
    public CommonResult QueryDkpGroup() {

        return null;
    }

    @ApiOperation(value = "查看团详情")
    @RequestMapping(value = "/getDkpGroupDetail", method = RequestMethod.POST)
    public CommonResult getDkpGroupDetail() {

        return null;
    }

    @ApiOperation(value = "团活动DKP结算预览")
    @RequestMapping(value = "/settlementGroupDkpPreview", method = RequestMethod.POST)
    public CommonResult settlementGroupDkpPreview() {

        return null;
    }

    @ApiOperation(value = "团活动DKP结算")
    @RequestMapping(value = "/settlementGroupDkp", method = RequestMethod.POST)
    public CommonResult settlementGroupDkp() {

        return null;
    }


}
