package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author: TNH
 * @create: 2019/12/23 15:09
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
