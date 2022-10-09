package com.zwchen.example.msa.springboot.mapper;

import com.zwchen.example.msa.springboot.po.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> getAllusers();

    @Delete("delete from tb_user where id=#{id}")
    void delete(Integer id);
}
