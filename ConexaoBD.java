package telas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*

package telas;

/**
 *
 * @author marcelo
 */
public class ConexaoBD {
    
    String serverName = "localhost:3307";
    String database = "casaemadeira";
    String url = "jdbc:mysql://" + serverName + "/" + database;
    String usarname = "root";
    String password = "";
    Connection conexao;
    
    ConexaoBD() throws SQLException {
        
        conexao = DriverManager.getConnection(url, usarname, password);
        
        
    }
    
}
