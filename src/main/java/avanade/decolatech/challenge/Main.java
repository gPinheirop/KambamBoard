package avanade.decolatech.challenge;

import avanade.decolatech.challenge.persistence.migration.MigrationStrategy;
import avanade.decolatech.challenge.ui.MainMenu;

import java.sql.SQLException;

import static avanade.decolatech.challenge.persistence.config.ConnectionConfig.getConnection;


public class Main {
    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }
}
