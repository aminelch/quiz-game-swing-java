package qcm.mysql;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
 
    /**Inserts new record in Person table as you pass new Person instance**/
    @Override
    public void insert(Person person) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO users (username,password,score)" +
                    "VALUES (?, ?,?)");
            preparedStatement.setString(1, person.getUsername());
            preparedStatement.setString(2, person.getUserpass());
            preparedStatement.setInt(3,0);
            preparedStatement.execute();
            System.out.println("============= L'utilisateur est inscrit avec succés ============= ");
            
            
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
 
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    /**Returns specific record (single person object) from table depending on "id" you provide**/
    @Override
    public Person selectById(int id) {
        Person person = new Person();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
 
            while (resultSet.next()) {
                person.setScore(resultSet.getInt("score"));
                person.setUsername(resultSet.getString("username"));
                person.setUserpass(resultSet.getString("password"));
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return person;
    }
 
    /**Retourne le 10 premiers joeurs  qui ont le > score**/
    @Override
    public List<Person> selectAll() {
        List<Person> persons = new ArrayList<Person>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from users order by score desc limit 10");
 
            while (resultSet.next()) {
                Person person = new Person();
                person.setScore(resultSet.getInt("score"));
                person.setUsername(resultSet.getString("username"));
                person.setUserpass(resultSet.getString("password"));
 
                persons.add(person);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return persons;
    }
 
    /**Deletes single record depending on "id" you provide**/
    @Override
    public void delete(String username) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM users WHERE username= ? ");
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
 
            System.out.println("==== L'utilisateur "+ username +"est supprimé ====");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    /**Updates a specific record depending on "id"
     * after you pass new Person object with new values**/
    @Override
    public void update(Person person, String username) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE users SET " +
                    "username = ?, password= ? WHERE username = ?");
 
            preparedStatement.setString(1, person.getUsername());
            preparedStatement.setString(2, person.getUserpass());
            preparedStatement.setString(3, username);
            preparedStatement.executeUpdate();
 
            System.out.println("UPDATE users SET " +
                    "username = ?, password = ? WHERE id = ?");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    // retourne un  un obj de type person qui contien l'utilisateur trouvé 
     public Person fetchUser(String username, String password ) {
        Person person = new Person();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username= ? AND password =?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            
        
   
            while (resultSet.next()) {
                person.setUsername(resultSet.getString("username"));
                person.setUserpass(resultSet.getString("password"));
                person.setScore(resultSet.getInt("score"));
            }
            
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return person;
    }
 
     
     public Person getBestScore() {
        Person person = new Person();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            //preparedStatement = connection.prepareStatement("SELECT MAX(`score`) FROM `users` LIMIT 1");
            
           Statement s2 = connection.createStatement();
                     s2.execute("SELECT username,score FROM users ORDER BY score DESC LIMIT 3");    
           ResultSet rs2 = s2.getResultSet(); 
           if (rs2.next()) {
                person.setScore(rs2.getInt("score"));
                person.setUsername(rs2.getString("username"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return person;
    }


 public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<Question>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT* FROM questions ORDER BY RAND()");
 
            while (resultSet.next()) {
                Question question = new Question();
                question.setId(resultSet.getInt("id"));
                question.setQuestion(resultSet.getString("question"));
                question.setReponse(resultSet.getString("reponse"));
                question.setOp1(resultSet.getString("op1"));
                question.setOp2(resultSet.getString("op2"));
                question.setOp3(resultSet.getString("op3"));
                question.setOp4(resultSet.getString("op4"));
 
                questions.add(question);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
 
        return questions;
    }

 
  public void updateUserScore(String username,int score) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
 
        try {
            connection = ConnectionConfiguration.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE users SET score = ? WHERE username = ?");
 
            preparedStatement.setInt(1, score);
            preparedStatement.setString(2, username);

            preparedStatement.executeUpdate();
 
            System.out.println("mise à jour avec succés");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
   

}