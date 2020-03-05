
package Repository;
import Connection.ConnectionFactory;
import Entidades.Barco;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author labcisco
 */
 public class BarcoR {
 public class BarcoRepository extends BaseRepository<Barco> {
             private final ConnectionFactory connection;

           public BarcoRepository(ConnectionFactory connectionFactory) {
                      super(connectionFactory);
                              this.connection = super.getConnectionFactory();
    }

    
    void delete(int id) throws Exception {
        final String sql = "Borrar Barcos id_barco = ?";

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            statement.executeUpdate();

        }
    }


    void update(Barco Barco) throws Exception {
        final String sql = "Barcos Id_Socio = ?, Nombre = ?, Amarre = ?, Cuota = ?";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setInt(1, barco.getIdSocio());
            statement.setString(2, barco.getNombreBarco());
            statement.setInt(3, barco.getNumAmarre());
            statement.setInt(4, barco.getCuotaAmarre());

            statement.executeUpdate();

        }
    }

   
    void add(Barco barco) throws Exception {
        final String sql = "Colocar Datos de Barco(Id_socio, Nombre, Amarre, Cuota)";
              try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
                   statement.setInt(1, barco.getIdSo());
                            statement.setString(2, barco.getNomBar());
                                     statement.setInt(3, barco.getNumAmar());
                                         statement.setInt(4, barco.getCuotaAmar());
                                                          statement.executeUpdate();

        }
    }

}
}
