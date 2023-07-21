package DAO.ImpDAO;

import DAO.IUserDAO;
import DBConnect.DBConnect;
import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

  Statement statement = null;
  PreparedStatement ps = null;
  ResultSet rs = null;

  @Override
  public List<User> getALlUser() {

    List<User> list = new ArrayList<>();
    String query = "SELECT * FROM user";
    try {
      statement = DBConnect.getInstall().get();
      ps = statement.getConnection().prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {

        list.add(new User(rs.getInt(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getInt(5),
            rs.getString(6)));

      }

    } catch (SQLException e) {
      throw new RuntimeException();
    }

    return list;
  }
}
