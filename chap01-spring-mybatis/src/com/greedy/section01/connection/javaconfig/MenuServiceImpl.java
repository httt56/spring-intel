package com.greedy.section01.connection.javaconfig;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service ("menuService")
    public class MenuServiceImpl implements MenuService {
    private final MenuDAO menuDAO;
    private final SqlSessionTemplate slSession;

    @Autowired
    public MenuServiceImpl(MenuDAO menuDAO, SqlSessionTemplate slSession) {

        this.menuDAO = menuDAO;
        this.slSession = slSession;
    }

    @Override
    public List<MenuDTO> seleMenuList() {
        return menuDAO.selectMenuList(slSession);
    }


}
