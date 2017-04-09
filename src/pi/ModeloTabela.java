/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Crawlers
 */
public class ModeloTabela extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    private boolean[] editado;
    
    public ModeloTabela(ArrayList lin, String[] col){
        
        setLinhas(lin);
        setColunas(col);
        
        editado = new boolean[lin.size()];
    }
    public ArrayList getLinhas(){
        return linhas;
    }
    public void setLinhas(ArrayList dados){
        linhas = dados;
    }
    public String[] getColunas(){
        return colunas;
    }
    public void setColunas(String[] nomes){
        colunas = nomes;
    }
    public int getColumnCount(){
        return colunas.length;
    }
    public int getRowCount(){
        return linhas.size();
    }
    public String getColumnName(int numCol){
        return colunas[numCol];
    }
    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
    public boolean isLinhaEditada(int l) {
        return editado[l];
    }
    
    @Override
    public void setValueAt(Object value, int l, int c) {
        Object[] linha = (Object[])getLinhas().get(l);
        linha[c] = value;
        editado[l] = true;
    }
    
    @Override
    public boolean isCellEditable(int r, int c) {
        return false;
    }
}
