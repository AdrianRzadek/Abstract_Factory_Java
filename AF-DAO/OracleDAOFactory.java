public abstract class OracleDAOFactory {
   public static OracleDAOFactory getDAOFactory(){
      return new OracleDAOFactoryImpl();
   }
   public abstract CustomerDAO getCustomerDAO();
   public abstract OrderDAO getOrderDAO();
   public abstract ProductDAO getProductDAO();
}

public class OracleDAOFactoryImpl extends OracleDAOFactory {

   public CustomerDAO getCustomerDAO() {
      return new OracleCustomerDAO();
   }

   public OrderDAO getOrderDAO() {
      return new OracleOrderDAO();
   }

   public ProductDAO getProductDAO() {
      return new OracleProductDAO();
   }
}

public interface CustomerDAO {
   public List<Customer> getAllCustomers();
   public Customer getCustomerById(int id);
   public void updateCustomer(Customer customer);
   public void deleteCustomer(Customer customer);
   public void createCustomer(Customer customer);
}

public class OracleCustomerDAO implements CustomerDAO {
   public List<Customer> getAllCustomers() {
      // implementacja zapytania SQL do pobrania wszystkich klientów
   }
   public Customer getCustomerById(int id) {
      // implementacja zapytania SQL do pobrania klienta o określonym identyfikatorze
   }
   public void updateCustomer(Customer customer) {
      // implementacja zapytania SQL do aktualizacji danych klienta
   }
   public void deleteCustomer(Customer customer) {
      // implementacja zapytania SQL do usunięcia klienta
   }
   public void createCustomer(Customer customer) {
      // implementacja zapytania SQL do dodania nowego klienta
   }
}
