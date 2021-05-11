package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseHandler extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String ConnectionString = "jdbc:psql://" + host + ":" + port + "/" + dbname;
        Class.forName(" org . p o s t g r e s q l . Dr ive r ");
        dbConnection = DriverManager.getConnection(ConnectionString, username, pass);

        return dbConnection;
    }

    public void addNewNote(String id, String color, String text) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO" + Const.USER_TABLE + "(" + Const.ID + "," + Const.COLOR + "," + Const.TEXT + ")"
                + "VALUES (?,?,?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, id);
        prSt.setString(2, color);
        prSt.setString(1, text);

        prSt.executeUpdate();
    }
}
