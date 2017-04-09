/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.sql.*;

/**
 *
 * @author Crawlers
 */
public class Conexao {
    
    //Variaveis de conexao com o MYSql
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    //Atributos do Driver de Coonexao
    
    //String url = "jdbc:mysql://localhost/pi";
    //String driver = "com.mysql.jdbc.Driver";
    //String usuario = "root";
    //String senha = "Projeto@2015";
    String url = "jdbc:derby:";
    String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    //String usuario = "root";
    //String senha = "Projeto@2015";
    
    private static Conexao instancia;
    
    public static Conexao getInstancia() {
        if (instancia == null) {
            instancia = new Conexao();
        }
        
        return instancia;
    }
    
    public Conexao() {
        
    }
    
    public void abrirConexao(){
        
        try {
            String homeDir = System.getProperty("user.home");
            
            homeDir = homeDir.replace('\\', '/');
            
            if (!homeDir.endsWith("/")) {
                homeDir += "/";
            }
            
            url += homeDir + "softmoney/db;create=true";
            
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url);//, usuario, senha);
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            
            //JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }
    
    public void initDatabase() {
        try {
            abrirConexao();
            Statement st = con.createStatement();

            st.executeUpdate(
                    "create table users(" +
                    " ID_usuario int not null" +
                    " GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)" +
                    " CONSTRAINT ID_usuario_PK PRIMARY KEY," +
                    " nome varchar(255) not null," +
                    " senha varchar(255) not null," +
                    " email varchar(255) not null)"
            );
            
            st.executeUpdate(
                    "create table receitas(" +
                    " ID_receitas int not null " +
                    " GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)" +
                    " CONSTRAINT ID_receitas_PK PRIMARY KEY," +
                    " descricao clob not null," +
                    " valor double not null," +
                    " periodo varchar(255) not null,"+
                    " categoria varchar(255) not null,"+
                    " ID_usuario int)" 

            );
            
            st.executeUpdate(
                    "alter table receitas" +
                    " add constraint fk_id_receitas" +
                    " foreign key (ID_usuario)" +
                    " references users (ID_usuario)"
            );
            
            st.executeUpdate(
                    "create table despesas(" +
                    " ID_despesas int not null" +
                    " GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)" +
                    " CONSTRAINT ID_despesas_PK PRIMARY KEY," +
                    " descricao clob not null," +
                    " valor double not null," +
                    " periodo varchar(255) not null," +
                    " categoria varchar(255) not null," +
                    " ID_usuario int)"
            );
            
            st.executeUpdate(
                    "alter table despesas" +
                    " add constraint fk_id_despesas" +
                    " foreign key (ID_usuario)" +
                    " references users (ID_usuario)"
            );
            
            st.executeUpdate(
                    "create table lembretes(" +
                    " ID_lembretes int not null" +
                    " GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1)" +
                    " CONSTRAINT ID_lembretes_PK PRIMARY KEY," +
                    " descricao clob not null," +
                    " valor double not null," +
                    " periodo varchar(255) not null," +
                    " categoria varchar(255) not null," +
                    " ID_usuario int)"
            );
            
            st.executeUpdate(
                    "alter table lembretes" +
                    " add constraint fk_id_lembretes" +
                    " foreign key (ID_usuario)" +
                    " references users (ID_usuario)"
			);
        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
}
