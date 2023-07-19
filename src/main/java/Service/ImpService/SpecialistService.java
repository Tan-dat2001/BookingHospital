package Service.ImpService;

import DAO.ImpDAO.SpecialistDAO;
import Model.specialist;
import Service.ISpecialistService;

import java.util.List;

public class SpecialistService implements ISpecialistService {
  public SpecialistService specialistService;

  public SpecialistService getInstance(){
    if (specialistService == null){
      specialistService = new SpecialistService();
    }
    return specialistService;

  }

  @Override
  public List<specialist> getAll() throws Exception {
    return new SpecialistDAO().getAll();
  }
}
