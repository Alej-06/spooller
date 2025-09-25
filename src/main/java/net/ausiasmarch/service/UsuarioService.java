package net.ausiasmarch.service;
import java.sql.Connection;
import java.sql.SQLException;

import net.ausiasmarch.connection.HikariConfiguration;
import net.ausiasmarch.dao.UsuarioDao;
import net.ausiasmarch.exception.ResourceNotFoundException;
import net.ausiasmarch.model.UsuarioBean;

public class UsuarioService {
    public UsuarioBean get(Long id) throws SQLException, ResourceNotFoundException {
        
        try (Connection oConnection = HikariConfiguration.getConnection()) {

        //Es mucho más conveniente crear la conexión aquí y pasarla al DAO
        UsuarioDao oUsuarioDao = new UsuarioDao(oConnection);
        UsuarioBean oUsuarioBean = oUsuarioDao.get(id);
        return oUsuarioBean;
    }

}

}
