package com.pi.admin.controller;

import com.pi.admin.model.dto.MemberQuery;
import com.pi.admin.model.dto.WowTeamParam;
import com.pi.admin.model.wow.MemberDkpInfo;
import com.pi.admin.model.wow.WowGroup;
import com.pi.admin.model.wow.WowGroupMember;
import com.pi.admin.model.wow.WowMemberInfo;
import com.pi.admin.service.WowGroupDkpService;
import com.pi.admin.service.WowTeamService;
import com.pi.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gturn
 * @Title: WowTeamMemberController
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/12/23 17:33
 */
@RestController
@Api(tags = "WowTeamMemberController", description = "成员参团DKP查看api")
@RequestMapping("/wowMember")
public class WowTeamMemberController {
    @Autowired
    private WowTeamService wowTeamService;
    @Autowired
    private WowGroupDkpService wowGroupDkpService;

    @ApiOperation(value = "查看团队信息")
    @RequestMapping(value = "/queryTeamInfo", method = RequestMethod.POST)
    public CommonResult queryTeamInfo(Long id) {
        WowTeamParam wowMemberInfos = wowTeamService.queryTeamInfoById(id);
        return CommonResult.success(wowMemberInfos);
    }

    @ApiOperation(value = "创建个人角色信息")
    @RequestMapping(value = "/createWowMemberInfo", method = RequestMethod.POST)
    public CommonResult createWowMemberInfo(WowMemberInfo memberInfo) {
        Integer i = wowTeamService.createWowMemberInfo(memberInfo);
        if (i.equals(0)) {
            return CommonResult.failed("您已经有团队了！");
        }
        return CommonResult.success(i);
    }

    @ApiOperation(value = "修改个人角色信息")
    @RequestMapping(value = "/updateWowMemberInfo", method = RequestMethod.POST)
    public CommonResult updateWowMemberInfo(WowMemberInfo memberInfo) {
        wowTeamService.updateWowMemberInfo(memberInfo);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "查看团活动")
    @RequestMapping(value = "/getDkpGroupDetail", method = RequestMethod.POST)
    public CommonResult getDkpGroupDetail(Long gourpId) {
        WowGroup group = wowGroupDkpService.getDkpGroupDetail(gourpId);
        return CommonResult.success(group);
    }

    @ApiOperation(value = "参加团活动")
    @RequestMapping(value = "/addGroupMember", method = RequestMethod.POST)
    public CommonResult addGroupMember(WowGroupMember wowGroupMember) {
        Integer i = wowTeamService.addGroupMember(wowGroupMember);
        if (i.equals(0)) {
            return CommonResult.failed("您已经有团队了！");
        }
        return CommonResult.success(i);
    }

    @ApiOperation(value = "修改团活动")
    @RequestMapping(value = "/updateGroupMember", method = RequestMethod.POST)
    public CommonResult updateGroupMember(WowGroupMember wowGroupMember) {
        wowTeamService.updateGroupMember(wowGroupMember);
        return CommonResult.success(null);
    }

    @ApiOperation(value = "个人DKP信息")
    @RequestMapping(value = "/getGroupDkpInfo", method = RequestMethod.POST)
    public CommonResult getGroupDkpInfo(Long memberId) {
        MemberDkpInfo memberDkpInfo =  wowTeamService.myGroupDkpInfo(memberId);
        return CommonResult.success(memberDkpInfo);
    }
}
