package cn.slimsmart.redis;


import cn.slimsmart.redis.spring.data.redis.demo.OrderDao;
import org.junit.Test;

public class OrderDaoTest extends BaseTest {

	@Test
	public void orderDaoTest() {
		OrderDao orderDao = applicationContext.getBean(OrderDao.class);
		orderDao.save(order);
		System.out.println(orderDao.read("10000").getCreateDate());
		orderDao.delete("10000");
		System.out.println(orderDao.read("10000"));
	}
}
