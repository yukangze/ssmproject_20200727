package com.hy.ssm.yu.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yukangze
 * @since 2020-07-27
 */
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "deptName=" + deptName +
        "}";
    }
}
