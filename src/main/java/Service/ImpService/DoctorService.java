package Service.ImpService;

import DAO.IDoctorDAO;
import Model.doctor;
import Service.IDoctorService;

import javax.inject.Inject;
import java.util.List;

public class DoctorService implements IDoctorService {
    @Inject
    private IDoctorDAO doctorDAO;

    @Override
    public List<doctor> Alldoctorlist() {
        return doctorDAO.Alldoctorlist();
    }
}
