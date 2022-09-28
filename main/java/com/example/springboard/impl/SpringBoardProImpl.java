package com.example.springboard.impl;

import com.example.springboard.mapper.SpringBoardProDAO;
import com.example.springboard.service.SpringBoardProService;
import com.example.springboard.vo.SpringBoardProVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("springBoardProService")
public class SpringBoardProImpl implements SpringBoardProService {
    @Autowired
    SpringBoardProDAO springBoardProDAO;

    @Override
    public List<SpringBoardProVO> selectboardlist() {
        return null;
    }

    @Override
    public SpringBoardProVO selectBoardID(String id) {
        System.out.println(id);
        return springBoardProDAO.selectBoardID(id);
    }

    @Override
    public void insert(SpringBoardProVO springBoardProVO) {

    }

    @Override
    public void update(SpringBoardProVO springBoardProVO) {

    }

    @Override
    public void delete(String id) {

    }
}
