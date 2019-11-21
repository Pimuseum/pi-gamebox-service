package com.pi.admin.model.wow;

import java.util.ArrayList;
import java.util.List;

public enum WowDuty {
    PI_WOW_TANK("坦克", 1),
    /**营销活动 (红包)*/
    PI_WOW_HEALER("治疗", 2),
    /** 营销活动 (新团购) */
    PI_WOW_DPS("输出", 3);

    private final String value;
    private final Integer type;

    public String getValue() {
        return value;
    }

    public Integer getType() {
        return type;
    }

    private WowDuty(String value, Integer type) {
        this.value = value;
        this.type = type;
    }

    public static WowDuty findByValue(Integer type) {
        for (WowDuty wowDuty : WowDuty.values()) {
            if (wowDuty.getType().equals(type)) {
                return wowDuty;
            }
        }
        throw new IllegalArgumentException("不存在该类型职责 type：" + type);
    }

    public static List<Integer> getAlltypes(){
        ArrayList<Integer> results = new ArrayList<>();
        for (WowDuty value : WowDuty.values()) {
            results.add(value.getType());
        }
        return results;
    }
}
