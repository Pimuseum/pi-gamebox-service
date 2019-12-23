package com.pi.admin.controller;

import com.github.pagehelper.Page;
import com.pi.admin.model.dto.UmsAdminLoginParam;
import com.pi.admin.model.wow.DkpLog;
import com.pi.admin.model.wow.WowGroup;
import com.pi.admin.service.WowGroupDkpService;
import com.pi.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private WowGroupDkpService wowGroupDkpService;

    @ApiOperation(value = "开团-设置团DKP规则")
    @RequestMapping(value = "/openDkpGroup", method = RequestMethod.POST)
    public CommonResult openDkpGroup(WowGroup wowGroup) {
        Integer i = wowGroupDkpService.openDkpGroup(wowGroup);
        if (i.equals(0)) {
            return CommonResult.failed("该时间段您已经有团活动存在!");
        }
        return CommonResult.success(i);
    }

    @ApiOperation(value = "修改团-设置团DKP规则")
    @RequestMapping(value = "/updateDkpGroup", method = RequestMethod.POST)
    public CommonResult updateDkpGroup(WowGroup wowGroup) {
        Integer integer = wowGroupDkpService.updateDkpGroup(wowGroup);
        if (integer.equals(0)) {
            return CommonResult.failed("修改失败！");
        }
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "取消团-设置团DKP规则")
    @RequestMapping(value = "/cancelDkpGroup", method = RequestMethod.POST)
    public CommonResult cancelDkpGroup(Long groupId, Boolean flag) {
        Integer integer = wowGroupDkpService.cancelDkpGroup(groupId, flag);
        if (integer.equals(0)) {
            return CommonResult.failed("修改失败，该团无法操作状态！");
        }
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "删除团-设置团DKP规则")
    @RequestMapping(value = "/delDkpGroup", method = RequestMethod.POST)
    public CommonResult delDkpGroup(Long groupId, Boolean flag) {
        Integer integer = wowGroupDkpService.delDkpGroup(groupId, flag);
        if (integer.equals(0)) {
            return CommonResult.failed("修改失败,该团无法操作状态！");
        }
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "查看我开的团")
    @RequestMapping(value = "/QueryDkpGroup", method = RequestMethod.POST)
    public CommonResult QueryDkpGroup(String note) {
        List<WowGroup> groups = wowGroupDkpService.QueryDkpGroup(note);
        return CommonResult.success(groups);
    }

    @ApiOperation(value = "查看团详情")
    @RequestMapping(value = "/getDkpGroupDetail", method = RequestMethod.POST)
    public CommonResult getDkpGroupDetail(Long gourpId) {
        WowGroup group  = wowGroupDkpService.getDkpGroupDetail(gourpId);
        return CommonResult.success(group);
    }

    @ApiOperation(value = "团活动DKP结算预览")
    @RequestMapping(value = "/settlementGroupDkpPreview", method = RequestMethod.POST)
    public CommonResult settlementGroupDkpPreview(Long gourpId) {
        List<DkpLog> dkpLogs = wowGroupDkpService.settlementGroupDkpPreview(gourpId);
        return CommonResult.success(dkpLogs);
    }

    @ApiOperation(value = "团活动DKP结算")
    @RequestMapping(value = "/settlementGroupDkp", method = RequestMethod.POST)
    public CommonResult settlementGroupDkp(List<DkpLog> dkpLogs,String note) {
        wowGroupDkpService.settlementGroupDkp(dkpLogs,note);
        return CommonResult.success(null);
    }


}
