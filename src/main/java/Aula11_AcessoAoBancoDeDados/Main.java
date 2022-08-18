package Aula11_AcessoAoBancoDeDados;

import java.sql.*;


public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Animal;CREATE TABLE Animal"+
            "("+"id INT PRIMARY KEY,"
            +"Nome VARCHAR(100) NOT NULL,"
            +"Tipo VARCHAR(100) NOT NULL"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Animal(id,Nome,Tipo) VALUES (1,'Meg','Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal(id,Nome,Tipo) VALUES (2,'Tobias','Cavalo')";
    private static final String sqlInsert3 = "INSERT INTO Animal(id,Nome,Tipo) VALUES (3,'Miau','Gato')";
    private static final String sqlInsert4 = "INSERT INTO Animal(id,Nome,Tipo) VALUES (4,'Tob','Cachorro')";
    private static final String sqlInsert5 = "INSERT INTO Animal(id,Nome,Tipo) VALUES (5,'Max','Elefante')";

    private static final String sqlDelete = "DELETE FROM Animal WHERE id=2";

    public static void main(String[] args) throws Exception{
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            ShowAnimal(connection);
            statement.execute(sqlDelete);
            ShowAnimal(connection);

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            if(connection == null){
                return;
            }
            connection.close();
        }
    }
    private static void ShowAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM Animal";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1)+" - "+resultSet.getString(2)+" - "+
                    resultSet.getString(3));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        //em user e password colocar as suas próprias credenciais
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
}
