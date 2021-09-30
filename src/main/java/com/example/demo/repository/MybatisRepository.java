package com.example.demo.repository;

import com.example.demo.BoardMybatis;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MybatisRepository {

    List<BoardMybatis> findAll() throws Exception;
}
