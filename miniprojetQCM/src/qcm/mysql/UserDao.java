package qcm.mysql;


import java.util.List;

public interface UserDao {
 
 
 
    void insert(Person person);
 
    Person selectById(int id);
 
    List<Person> selectAll();
 
    void delete(String username);
 
    void update(Person person,String username);
}
