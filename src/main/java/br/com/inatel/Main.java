package br.com.inatel;

import br.com.inatel.persistence.migration.MigrationStrategy;
import br.com.inatel.ui.MainMenu;

import java.sql.SQLException;

import static br.com.inatel.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
