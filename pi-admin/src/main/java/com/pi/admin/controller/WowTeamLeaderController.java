package com.pi.admin.controller;

import com.pi.admin.model.adminUser.UmsAdmin;
import com.pi.admin.model.adminUser.UmsRole;
import com.pi.admin.model.dto.WowTeamParam;
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
    public CommonResult creatTeam(@RequestBody WowTeam wowTeam) {
        Integer integer = wowTeamService.creatTeam(wowTeam);
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "修改团队信息")
    @RequestMapping(value = "/updateTeam", method = RequestMethod.POST)
    public CommonResult updateTeam(@RequestBody WowTeam wowTeam) {
        Integer integer =wowTeamService.updateTeam(wowTeam);
        return CommonResult.success(integer);
    }

    @ApiOperation(value = "查看团队信息")
    @RequestMapping(value = "/teamInfo", method = RequestMethod.POST)
    public CommonResult teamInfo(Principal principal) {
        String username = principal.getName();
        UmsAdmin umsAdmin = adminService.getAdminByUsername(username);
        WowTeamParam wowTeamParam = wowTeamService.teamInfo(umsAdmin.getNote());
        return CommonResult.success(wowTeamParam);
    }

    @ApiOperation(value = "查看团成员")
    @RequestMapping(value = "/queryTeamMembers", method = RequestMethod.POST)
    public CommonResult queryTeamMembers() {

        return null;
    }

    @ApiOperation(value = "修改团员信息")
    @RequestMapping(value = "/updateTeamMember", method = RequestMethod.POST)
    public CommonResult updateTeamMember() {

        return null;
    }

    @ApiOperation(value = "删除团员信息")
    @RequestMapping(value = "/delTeamMember", method = RequestMethod.POST)
    public CommonResult delTeamMember() {

        return null;
    }

    @ApiOperation(value = "管理团员DKP(奖励，扣除)")
    @RequestMapping(value = "/updateTeamMemberDKP", method = RequestMethod.POST)
    public CommonResult updateTeamMemberDKP() {

        return null;
    }

}
