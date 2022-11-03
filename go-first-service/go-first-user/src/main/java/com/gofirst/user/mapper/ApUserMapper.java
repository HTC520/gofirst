package com.gofirst.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gofirst.model.user.pojos.ApUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : KKQ  2022/11/3 0003 15:51 我是中国人，我爱自己的祖国
 * @apiNote : 用户Mapper
 **/
@Mapper
public interface ApUserMapper extends BaseMapper<ApUser> {
}
