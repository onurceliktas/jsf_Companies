package com.companies.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.companies.util.DataConnect;

/**
 *
 * @author onur
 */
public class LoginDAO {

    public static boolean validate(String user_userName, String user_pw) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DataConnect.getConnection();
            ps = con.prepareStatement("Select user_userName, user_pw from Users where user_userName = ? and user_pw = ?");
            ps.setString(1, user_userName);
            ps.setString(2, user_pw);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Login error -->" + ex.getMessage());
            return false;
        } finally {
            DataConnect.close(con);
        }
        return false;
    }

}
