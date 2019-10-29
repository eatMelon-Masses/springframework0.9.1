package com.interface21.jdbc.origin.jdbc;

import junit.framework.TestCase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @date 2019-10-29
 */
public class OriginJdbcTest extends TestCase {
    private Log log = LogFactory.getLog(OriginJdbcTest.class);

    public void testOriginJdbcConnect() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        final Connection connection = DriverManager.getConnection("jdbc:mysql:///spring_test?user=root&password=jian031018");
        if (connection != null) {
            this.log.info("建立连接成功");
        }
        final Statement statement = connection.createStatement();
        final ResultSet resultSet = statement.executeQuery("select * from insert_test_seq1");
        int i = 0;
        while (resultSet.next()) {
            this.log.info(i+++":data:"+resultSet.getInt(1));

        }
    }

    public void testHelloWorld() {
        this.log.info("hellowrold");
    }
}
