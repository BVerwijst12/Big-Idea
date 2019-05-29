package DAL.MySqlContext;

import DAL.DbConfig;

import Domain.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
                PokemonDto pokemon = new PokemonDto();
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
