package com.manyit.project.dao;

import com.manyit.project.core.Mapper;
import com.manyit.project.model.File;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface FileMapper extends Mapper<File> {

    File abcd(int id);

    @Select("SELECT * FROM t_file WHERE id = #{id}")
    File qwer(@Param("id") int id);
}