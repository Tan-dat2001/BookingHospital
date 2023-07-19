package DAO.ImpDAO;

import DAO.ISpecialistDAO;
import DBConnect.DBConnect;
import Model.specialist;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SpecialistDAO implements ISpecialistDAO {
  Statement statement = null;
  PreparedStatement ps = null;
  ResultSet rs = null;



  @Override
  public List<specialist> getAll() throws Exception {
    List<specialist> list = new ArrayList<>();
    String query = "SELECT * FROM specialist";
    try{
      statement = DBConnect.getInstall().get();
      ps = statement.getConnection().prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {

        list.add(new specialist(rs.getInt(1),
            rs.getString(2),
            rs.getString(3)));

      }

    }catch (SQLException e){
      throw new RuntimeException();
    }

    return list;
  }

  public static void main(String[] args) throws Exception {
    System.out.println(new SpecialistDAO().getAll());
  }
}
