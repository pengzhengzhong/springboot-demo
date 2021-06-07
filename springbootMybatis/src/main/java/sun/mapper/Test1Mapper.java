package sun.mapper;

import sun.entity.Test1;

public interface Test1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    Test1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);
}