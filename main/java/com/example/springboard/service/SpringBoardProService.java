package com.example.springboard.service;

import com.example.springboard.vo.SpringBoardProVO;

import java.util.List;

public interface SpringBoardProService {

    List<SpringBoardProVO> selectboardlist();
    SpringBoardProVO selectBoardID(String id);
    void insert(SpringBoardProVO springBoardProVO);
    void update(SpringBoardProVO springBoardProVO);
    void delete(String id);
}
