package Repository;

/**
 *
 * @author labcisco
 */
public class SocioR {
        private final ConnectionFa connect;

        public SocioRepository(ConnectionF connectionF) {
            super(connectionF);
                 this.connection = super.getConnectionF();
    }
    void delete(int id) throws Exception {
        String sql = "DELETE FROM Socios WHERE Id_socio=?";

        try (Connection connectionEstablecida = this.connection.getConnection(); 
                PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
                statement.setInt(1, id);
                     System.out.println(statement);
                        statement.executeUpdate(sql);
        }
    }
        void update(Socio socio) throws Exception {
               String sql = "Socios SET Nombre = ?, Direccion = ? WHERE Id_Socio = ?";

        try (Connect connectionEstablecida = this.connect.getConnection(); 
                PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
                statement.setString(1, socio.getNombre());
                     statement.setString(2, socio.getDireccion());
                          statement.setInt(3, socio.getId());
                             statement.executeUpdate(sql);
          }
    }
    void add(Socio socio) throws Exception {
        String sql = "Ingresar Socios (Nombre, Direccion) VALUES (?,?)";
             try (Connect connectionEstablecida = this.connect.getConnection(); 
                     PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
                    statement.setString(1, socio.getNombre());
                            statement.setString(2, socio.getDireccion());
                                   statement.executeLargeUpdate(sql);
        }
    }
}

