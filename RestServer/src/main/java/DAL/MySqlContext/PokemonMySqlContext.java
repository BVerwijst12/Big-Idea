package DAL.MySqlContext;

import DAL.DbConfig;

import Dto.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PokemonMySqlContext {

    private String connectionString;

    public PokemonMySqlContext(){
        DbConfig dbConfig = new DbConfig();
        connectionString = dbConfig.getConnectionstring();
    }

    public ArrayList<PokemonDto> getAllPokemons(){
        String query = "SELECT * FROM Pokemon";
        try {
            ArrayList<PokemonDto> allPokemons = new ArrayList<PokemonDto>();
            String myDriver = "com.mysql.jdbc.Driver";
            Class.forName(myDriver);
            Connection connect = DriverManager.getConnection(connectionString, "dbi387128", "Wachtwoord1");

            PreparedStatement preparedStmt = connect.prepareStatement(query);

            ResultSet resultSet = preparedStmt.executeQuery();

            while (resultSet.next()){
                PokemonDto pokemon = new PokemonDto(resultSet.getString(1), resultSet.getInt(2)
                        , resultSet.getInt(3), resultSet.getInt(4), resultSet.getInt(5)
                        , resultSet.getInt(6), resultSet.getInt(7));
                allPokemons.add(pokemon);
            }

            return allPokemons;
        }
        catch (Exception e){
            System.out.println("Exception thrown  :" + e);
            return null;
        }
    }

}
