package DAO.ImpDAO;

import DAO.IDoctorDAO;
import DBConnect.DBConnect;
import Model.doctor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO implements IDoctorDAO {
    Statement statement = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    @Override
    public List<doctor> Alldoctorlist() {
        List<doctor> list = new ArrayList<>();
        String query = "SELECT * FROM doctor";
        try {
            statement = DBConnect.getInstall().get();
            ps = statement.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new doctor(rs.getInt("id"),
                        rs.getInt("specialist_id"), rs.getString("email"),
                        rs.getString("password"), rs.getString("name"),
                        rs.getString("phone"), rs.getString("image"),
                        rs.getString("intro"), rs.getString("gender")));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) {
        DoctorDAO doctorDAO = new DoctorDAO();

        System.out.println(doctorDAO.Alldoctorlist());
    }
}

