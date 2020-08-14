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
public class Post extends Model<Post> {

    private static final long serialVersionUID = 1L;

    private String postName;

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Post{" +
        "postName=" + postName +
        "}";
    }
}
