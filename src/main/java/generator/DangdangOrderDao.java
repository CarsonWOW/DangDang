package generator;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DangdangOrderDao {
    long countByExample(DangdangOrderExample example);

    int deleteByExample(DangdangOrderExample example);

    int deleteByPrimaryKey(Integer doId);

    int insert(DangdangOrder record);

    int insertSelective(DangdangOrder record);

    List<DangdangOrder> selectByExample(DangdangOrderExample example);

    DangdangOrder selectByPrimaryKey(Integer doId);

    int updateByExampleSelective(@Param("record") DangdangOrder record, @Param("example") DangdangOrderExample example);

    int updateByExample(@Param("record") DangdangOrder record, @Param("example") DangdangOrderExample example);

    int updateByPrimaryKeySelective(DangdangOrder record);

    int updateByPrimaryKey(DangdangOrder record);
}