package MVC.DAO;

import bean.Stuff;

import java.util.List;
import java.util.Map;

public interface StuffDAO {

    List<Map> getHR(String stu_id);

    List<Map> getName();

    List<Map> getAll();

    int insert(Stuff stuff);
}
