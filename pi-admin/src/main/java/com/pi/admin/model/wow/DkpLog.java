package com.pi.admin.model.wow;

public class DkpLog {
    private Long id;

    private Long memberid;

    private String wowName;

    private Integer changeDkpValue;

    private Integer originalDkp;

    private Integer modifiedDkp;

    private String changeMsg;

    private String operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public String getWowName() {
        return wowName;
    }

    public void setWowName(String wowName) {
        this.wowName = wowName == null ? null : wowName.trim();
    }

    public Integer getChangeDkpValue() {
        return changeDkpValue;
    }

    public void setChangeDkpValue(Integer changeDkpValue) {
        this.changeDkpValue = changeDkpValue;
    }

    public Integer getOriginalDkp() {
        return originalDkp;
    }

    public void setOriginalDkp(Integer originalDkp) {
        this.originalDkp = originalDkp;
    }

    public Integer getModifiedDkp() {
        return modifiedDkp;
    }

    public void setModifiedDkp(Integer modifiedDkp) {
        this.modifiedDkp = modifiedDkp;
    }

    public String getChangeMsg() {
        return changeMsg;
    }

    public void setChangeMsg(String changeMsg) {
        this.changeMsg = changeMsg == null ? null : changeMsg.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}