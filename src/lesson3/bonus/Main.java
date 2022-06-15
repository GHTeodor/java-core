package lesson3.bonus;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) /*throws SQLException*/ {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "rootroot");

            PreparedStatement requestToDB = connection.prepareStatement("select * from actor");
            ResultSet resultSet = requestToDB.executeQuery();
            ArrayList<Actor> actors = new ArrayList<>();
            while (resultSet.next()) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString("last_name"));
                actors.add(new Actor(resultSet.getInt(1), resultSet.getString(2), resultSet.getString("last_name")));

            }

            System.out.println(actors);

            connection.close();
        } catch (SQLException e ) {
            throw new RuntimeException(e);
        }
    }
}