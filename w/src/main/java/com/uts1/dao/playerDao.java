package com.uts1.dao;

import com.uts1.entity.player;
import com.uts1.utility.DaoService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author william
 */
public class playerDao implements DaoService<player> {

    @Override
    public static List<player> fetchAllList() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public static int addData(player player) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int deleteData(player player) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int updateData(player player) throws ClassNotFoundException, SQLException {
        return 0;
    }
}
