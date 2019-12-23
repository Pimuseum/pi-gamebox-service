package com.pi.admin.controller;

import com.pi.admin.mapper.WowMemberInfoMapper;
import com.pi.admin.model.adminUser.UmsAdmin;
import com.pi.admin.model.adminUser.UmsRole;
import com.pi.admin.model.dto.MemberQuery;
import com.pi.admin.model.dto.WowTeamParam;
import com.pi.admin.model.wow.WowMemberInfo;
import com.pi.admin.model.wow.WowTeam;
import com.pi.admin.service.UmsAdminService;
import com.pi.admin.service.WowGroupDkpService;
import com.pi.admin.service.WowTeamService;
import com.pi.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

/**
 * @author Gturn
 * @Title: WowTeamLeaderController
 * @ProjectName pi-general-server
 * @Description: TODO
 * @date 2019/11/21 15:02
 */
@RestController
@Api(tags = "PiOpenGourpDKPController", description = "亲友团管理员api")
@RequestMapping("/wowLeader")
public class WowTeamLeaderController {

    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private WowTeamService wowTeamService;
    @Autowired
    private WowGroupDkpService wowGroupDkpService;

    @ApiOperation(value = "创建团队")
    @RequestMapping(value = "/creatTeam", method = RequestMethod.POST)
    public CommonResult createTeam(@RequestBody WowTeam wowTeam) {
        Integer integer = wowTeamService.createTeam(wowTeam);
        if (integer.equals(0)) {
            return CommonResult.failed("您已经有团队了！");
        }
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "修改团队信息")
    @RequestMapping(value = "/updateTeam", method = RequestMethod.POST)
    public CommonResult updateTeam(@RequestBody WowTeam wowTeam) {
        Integer integer = wowTeamService.updateTeam(wowTeam);
        if (integer.equals(0)) {
            return CommonResult.failed("修改失败！");
        }
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "查看团队信息")
    @RequestMapping(value = "/teamInfo", method = RequestMethod.POST)
    public CommonResult teamInfo(Principal principal) {
        String username = principal.getName();
        UmsAdmin umsAdmin = adminService.getAdminByUsername(username);
        WowTeamParam wowTeamParam = wowTeamService.teamInfo(umsAdmin.getNote());
        if (wowTeamParam == null) {
            return CommonResult.emptyReturn("抱歉,没有查询到对应的团队信息");
        }
        return CommonResult.success(wowTeamParam);
    }

    @ApiOperation(value = "查看团成员")
    @RequestMapping(value = "/queryTeamMembers", method = RequestMethod.POST)
    public CommonResult queryTeamMembers(MemberQuery memberQuery) {
        List<WowMemberInfo> wowMemberInfos = wowTeamService.queryTeamMembers(memberQuery);
        return CommonResult.success(wowMemberInfos);
    }

    @ApiOperation(value = "修改团员信息")
    @RequestMapping(value = "/updateTeamMember", method = RequestMethod.POST)
    public CommonResult updateTeamMember(WowMemberInfo wowMemberInfo) {
        Integer integer = wowTeamService.updateTeamMember(wowMemberInfo);
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "删除团员信息")
    @RequestMapping(value = "/delTeamMember", method = RequestMethod.POST)
    public CommonResult delTeamMember(Long id) {
        Integer integer = wowTeamService.delTeamMember(id);
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "管理团员DKP(奖励，扣除)")
    @RequestMapping(value = "/updateTeamMemberDKP", method = RequestMethod.POST)
    public CommonResult updateTeamMemberDKP(Long id, Integer dkp, String reasonMsg) {
        wowTeamService.updateTeamMemberDKP(id, dkp, reasonMsg);
        return CommonResult.success(null);
    }

}
