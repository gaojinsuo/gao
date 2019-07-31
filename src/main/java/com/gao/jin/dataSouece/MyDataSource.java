package com.gao.jin.dataSouece;

import java.sql.Connection;
import java.sql.SQLException;

public interface MyDataSource {

    Connection getConnection() throws SQLException;
}
