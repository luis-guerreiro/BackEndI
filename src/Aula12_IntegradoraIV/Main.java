package Aula12_IntegradoraIV;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Main {

    //Instrução para pegar a tabela Usuario, caso já exista, criar uma nova tabela

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario;CREATE TABLE Usuario"
            +"("
            +"id INT PRIMARY KEY,"
            +"Primeiro_Nome varchar(100) NOT NULL,"
            +"Sobrenome varchar(100) NOT NULL,"
            +"Idade INT NOT NULL"
            +")";

    //Instruções para inserir dados na tabela Usuario

    private static final String sqlInsert1 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade)" +
            "Values (1,'Maria','Almeida',50)";
    private static final String sqlInsert2 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade)" +
            "Values (2,'José','Silva',40)";
    private static final String sqlInsert3 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade)" +
            "Values (3,'Juliana','Barboza',20)";

    //Instrução para excluir um registro na Tabela Usuario

    private static final String sqlDelete = "DELETE FROM Usuario WHERE id=2";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String args[]) throws Exception{

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();

            //Executa a instrução da criação da tabela no banco de dados

            statement.execute(sqlCreateTable);

            //Executa as instruções para inserir dados na tabela

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            //Execução da instrução para excluir um registro da tabela

            statement.execute(sqlDelete);

            //Registra o log do Usuario que foi excluído da tabela

            logger.info("Excluído o usuário com o ID 2");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(connection==null){
                return;
            }
            connection.close();
        }
    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp//localhost/~/test","sa","");
    }


}
