package app;

import app.database.Database;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        System.out.println(database.data.toString());
    }
}
