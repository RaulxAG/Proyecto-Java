
package com.iesiliberis.crudcentroeducativo.controladorDAO;

import com.iesiliberis.crudcentroeducativo.BD.MyDataSource;
import com.iesiliberis.crudcentroeducativo.entidades.Aula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Raul AG
 */
public class AulaDaoImp implements AulaDao {
    
    private static AulaDaoImp instance;
    
    static{
        instance=new AulaDaoImp();
    }
    
    private AulaDaoImp(){ }
    
    public static AulaDaoImp getInstance(){
        return instance;
    }

    @Override
    public int add(Aula a) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Aula getById(int id) throws SQLException {
        Aula au=null;
        String sql="select * from aula where id=?";

        try(Connection cn=MyDataSource.getConnection();
            PreparedStatement pstm=cn.prepareStatement(sql);){
        
            pstm.setInt(1, id);
            
            ResultSet rs=pstm.executeQuery();
            
            if (rs.next()){
                au=new Aula();
                
                au.setId(rs.getInt("id"));
                
                au.setCodigo(rs.getString("codigo"));
                au.setDescripcion(rs.getString("descripcion"));
                
            }
            
        }
        
        return au;
    }

    @Override
    public List<Aula> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Aula a) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
