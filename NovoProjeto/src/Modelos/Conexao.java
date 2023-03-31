
package Modelos;

import java.sql.*;

public class Conexao {
    
//Criar um atributo na classe para manter a conexão com o banco
public Connection c;

public Conexao (){
//Inicializar o atributo de conexão como nulo antes de conectar
this.c = null;

//Conectar ao banco de dados:
try {
    Class.forName("org.sqlite.JDBC");
    this.c = DriverManager.getConnection("jdbc:sqlite:Quiroprata.db");
} catch ( Exception e ) {
    System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    System.exit(0);
}
System.out.println("Conexão com o banco de dados efetuada com sucesso");
}
}