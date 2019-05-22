package DAL;

public class DbConfig {

    private static String connectionstring = "Server=studmysql01.fhict.local;Uid=dbi387128;Database=dbi387128;Pwd=Wachtwoord1;";

    public String getConnectionstring(){
        return connectionstring;
    }
}
