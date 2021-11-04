package com.uts1.dao;

import com.uts1.entity.hutang;
import com.uts1.utility.DaoService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author william
 */
public class hutangDao implements DaoService<hutang> {

    @Override
    public List<hutang> fetchAllList() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int addData(hutang hutang) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int deleteData(hutang hutang) throws ClassNotFoundException, SQLException {
        return 0;
    }

    @Override
    public int updateData(hutang hutang) throws ClassNotFoundException, SQLException {
        return 0;
    }
}
