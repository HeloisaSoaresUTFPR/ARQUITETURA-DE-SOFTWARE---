/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author heloisa.costa
 */
public class TableAluno extends AbstractTableModel {
    
    List<Aluno> list;
    
    public TableAluno(List<Aluno> list){
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0  : return "Nome";
            default : return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         switch (columnIndex) {
            case 0 : return list.get(rowIndex).getNome();
                default:return null;
        }
    }

    @Override
    public int getColumnCount() {
        return 1;
    }
    
}
