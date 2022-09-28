package com.example.springboard.mapper;

import com.example.springboard.vo.SpringBoardProVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpringBoardProDAO {

    SpringBoardProVO selectBoardID(String id);

}
