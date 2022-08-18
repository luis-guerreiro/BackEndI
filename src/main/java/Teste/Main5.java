package Teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main5 {

    private static final String SQLCREATE = "DROP TABLE IF EXISTS Conta; " +
            "CREATE TABLE Conta " +
            "(" +
            " id INT PRIMARY KEY," +
            " nome VARCHAR(100) NOT NULL, " +
            " numeroConta VARCHAR(100) NOT NULL," +
            " saldo numeric(15,2) "+
            ");";

    private static final String SQLINSERT = "INSERT INTO Conta (id,nome,numeroConta,saldo) VALUES (?,?,?,?);";
    private static final String SQLUPDATE = "UPDATE Conta SET saldo = ? WHERE id = ?;";


    public static void main(String[] args) throws SQLException {
        Conta conta = new Conta(1,"Daniel","234dsfser2",30);
        Connection connection = null;

        try{
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQLCREATE);

            PreparedStatement prStatementInsert =  connection.prepareStatement(SQLINSERT);

            prStatementInsert.setInt(1,conta.getId());
            prStatementInsert.setString(2,conta.getNome());
            prStatementInsert.setString(3,conta.getNome());
            prStatementInsert.setDouble(4,conta.getSaldo());
            prStatementInsert.execute();


            PreparedStatement preparedStatementUpdate = connection.prepareStatement(SQLUPDATE);
            preparedStatementUpdate.setDouble(1,conta.aumentarSaldo(10));
            preparedStatementUpdate.setInt(2,conta.getId());
            preparedStatementUpdate.execute();

            connection.setAutoCommit(false);
            PreparedStatement preparedStatementUpdate2 = connection.prepareStatement(SQLUPDATE);
            preparedStatementUpdate2.setDouble(1,conta.aumentarSaldo(15));
            preparedStatementUpdate2.setInt(2,conta.getId());
            preparedStatementUpdate2.execute();
            int erro = 20/0;

            connection.commit();
            connection.setAutoCommit(true);

        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
        }finally {
            connection.close();
        }
    }
}
