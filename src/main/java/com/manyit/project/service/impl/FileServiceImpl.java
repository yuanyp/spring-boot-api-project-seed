package com.manyit.project.service.impl;

import com.manyit.project.dao.FileMapper;
import com.manyit.project.model.File;
import com.manyit.project.service.FileService;
import com.manyit.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/05/03.
 */
@Service
@Transactional
public class FileServiceImpl extends AbstractService<File> implements FileService {
    @Resource
    private FileMapper tFileMapper;

    @Override
    public File abcd(int id){
        return tFileMapper.abcd(id);
    }

    @Override
    public File qwer(int id){
        return tFileMapper.qwer(id);
    }
}
