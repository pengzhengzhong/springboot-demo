package sun.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import sun.entity.User;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User findById(Long id);

    List<User> findAll();

    int insert(User user);
}
