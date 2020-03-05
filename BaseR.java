package Repository;

import Connection.ConnectionFactory;
/**
 *
 * @author labcisco
 */
public class BaseR {
    private final ConnectionFactory connectionFactory;
    public BaseRepository(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    void add(T objeto) throws Exception {}
     void update(T objeto) throws Exception {}
      void delete(int id) throws Exception {}        
       public ConnectionFactory getConnectionF() {
        return connectionF;
    }
}
