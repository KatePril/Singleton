package app.database;

import java.util.ArrayList;

public class Database {

    private static Database instance;
    public ArrayList data = new ArrayList<>();

    private Database() {
        data.add("orange");
        data.add("apple");
        data.add("banana");
        data.add("grapes");
        data.add("pear");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

}
