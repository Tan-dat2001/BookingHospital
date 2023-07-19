package DAO;

import Model.specialist;
import java.util.List;

public interface ISpecialistDAO {
  List<specialist> getAll() throws Exception;

}
