package com.greedy.section01.connection.javaconfig;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("menuDAO")
public class MenuDAOImpl implements MenuDAO {

    public List<MenuDTO> selectMenuList(SqlSessionTemplate sqlSession){
        return sqlSession.selectList("MenuMapper.selectMenuList");
    }


}