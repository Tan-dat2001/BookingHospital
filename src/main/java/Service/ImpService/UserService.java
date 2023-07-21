package Service.ImpService;

import DAO.IUserDAO;
import DAO.ImpDAO.UserDAO;
import Model.User;
import Service.IUserService;
import java.util.List;
import javax.inject.Inject;

public class UserService implements IUserService {
  @Inject
  private IUserDAO userDAO;

  @Override
  public List<User> getAllUser() {

    return new UserDAO().getALlUser();
  }
}
