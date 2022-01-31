package nLayeredApp;

import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateImpls.HibernateProductDao;
import nLayeredApp.dataAccess.concretes.jdbcImpls.JdbcProductDao;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Elma", 15, 1, new String[] {});

		ProductManager manager = new ProductManager(new JdbcProductDao());
		manager.add(product);

		ProductManager manager2 = new ProductManager(new HibernateProductDao());
		manager2.add(product);
	}

}
