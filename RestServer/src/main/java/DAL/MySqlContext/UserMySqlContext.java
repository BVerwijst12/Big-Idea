package DAL.MySqlContext;

import DAL.DbConfig;

public class UserMySqlContext {
    private static String connectionString;

    public UserMySqlContext(){
        DbConfig dbConfig = new DbConfig();
        connectionString = dbConfig.getConnectionstring();
    }

    public boolean addUser(String Username, String Password){
        return true;
    }
}
