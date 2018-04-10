package exercise.exerdao;

import java.util.HashMap;
import java.util.List;

/*
创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
使用 Junit 单元测试类进行测试。

 */
public class TestDao {
    public static void main(String[] args) {

        Dao<User> dao=new Dao<>();
        dao.map1 =new HashMap<String,User>();
        dao.save("1001",new User(2001,23,"kaka"));
        dao.save("1003",new User(2005,27,"bale"));
       dao.save("1007",new User(2009,28,"Cr"));
        User u1=dao.get("1007");
        dao.update("1001",new User(2003,30,"messi"));
        dao.delete("1007");
        List<User> list =dao.list();
        System.out.println(list);
    }
}
