package com.zzl.mybatisplus.demo.domain.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzl
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser extends Model<SysUser> {

private static final long serialVersionUID=1L;

    private String name;

    private Integer id;

    private String addr;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
