import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import address.customer.Cust;
import address.customer.Customer;

class TestDriver {

	@Test
	void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("customer");
		assertAll(
		()->assertEquals(cust.getCname(),"manoj"),
		()->assertEquals(cust.getCid(),1234),
		()->assertEquals(cust.getCcontact(),8919887754),
		()->assertEquals(cust.getCaddress().getStreet(),"street"),
		()->assertEquals(cust.getCaddress().getCity(),"plots"),
		()->assertEquals(cust.getCaddress().getZip(),522202),
		()->assertEquals(cust.getCaddress().getCountry(),"India")
	);
	}
}