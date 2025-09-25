package net.ausiasmarch.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.ausiasmarch.exception.ResourceNotFoundException;
import net.ausiasmarch.model.UsuarioBean;

public class UsuarioDao {
    
    private final Connection oConnection;

    public UsuarioDao(Connection oConnection) {
        this.oConnection = oConnection;
        
    }

    public UsuarioBean get(Long id) throws SQLException, ResourceNotFoundException {
       String strSQL = "SELECT * FROM usuario WHERE id= ?";
       UsuarioBean oUsuarioBean;
        try (PreparedStatement oPreparedStatement = this.oConnection.prepareStatement(strSQL)) {
            oPreparedStatement.setLong(1, id);
            oPreparedStatement.executeQuery();
           try (ResultSet oResultSet = oPreparedStatement.getResultSet()) {
               oUsuarioBean = null;
               if (oResultSet.next()) {
                   oUsuarioBean = new UsuarioBean();
                   oUsuarioBean.setId(oResultSet.getLong("id"));
                   oUsuarioBean.setusername(oResultSet.getString("username"));
                   oUsuarioBean.setNombre(oResultSet.getString("nombre"));
                   oUsuarioBean.setApellido1(oResultSet.getString("apellido1"));
                   oUsuarioBean.setApellido2(oResultSet.getString("apellido2"));
                   
                   // oConnection.close(); Por el momento no cerramos la conexión
               } else {
                   // oConnection.close(); Por el momento no cerramos la conexión
                   throw new ResourceNotFoundException("Usuario con el id "+id+" no encontrado");
               }
                oResultSet.close();
                oPreparedStatement.close();
                // oConnection.close(); Por el momento no cerramos la conexión
                return oUsuarioBean;
           }
        }
        
    }



}
