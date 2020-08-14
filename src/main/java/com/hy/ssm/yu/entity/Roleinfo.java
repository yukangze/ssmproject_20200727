package com.hy.ssm.yu.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yukangze
 * @since 2020-08-08
 */
public class Roleinfo extends Model<Roleinfo> {

    private static final long serialVersionUID = 1L;

    private String rolename;

    private String userid;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Roleinfo{" +
        "rolename=" + rolename +
        ", userid=" + userid +
        "}";
    }
}
