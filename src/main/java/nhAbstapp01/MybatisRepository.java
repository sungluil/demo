package nhAbstapp01;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MybatisRepository {

    List<BoardMybatis> findAll() throws Exception;
}
