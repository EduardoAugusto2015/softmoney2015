/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.sql.PreparedStatement;

/**
 *
 * @author Crawlers
 */
public class SomaTotal{

    Conexao conexao = new Conexao();
    
    public double SomaReceitas(int id){

        conexao.abrirConexao();
        conexao.rs = null;
        double valorTotal = 0;
        try {
            conexao.st = conexao.con.createStatement();
            PreparedStatement st = conexao.con.prepareStatement("SELECT valor FROM receitas WHERE ID_usuario = ?");
            st.setInt(1, id);
            conexao.rs = st.executeQuery();
            
            while(conexao.rs.next()){
                
            valorTotal += conexao.rs.getDouble("valor");
            
            }
        } catch (Exception e) {
        }
        return valorTotal;
    }
    
    public double SomaDespesas(int id){
        
        conexao.abrirConexao();
        conexao.rs = null;
        double valorTotal = 0;
        
        try {
            conexao.st = conexao.con.createStatement();
            PreparedStatement st = conexao.con.prepareStatement("SELECT valor FROM despesas WHERE ID_usuario = ?");
            st.setDouble(1, id);
            conexao.rs = st.executeQuery();
            
            while(conexao.rs.next()){
                valorTotal = valorTotal + conexao.rs.getDouble("valor");
            }
        } catch (Exception e) {
        }
        return valorTotal;
    }
}
