package cn.zte.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zte.smbms.pojo.Bill;
import cn.zte.smbms.service.bill.BillService;


public class BillTest {
//	private Logger log = Logger.getLogger(UserTest.class);
//	public BillTest() {
//		
//	}
//	@Test
//	public void testBill() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		BillService service =(BillService)context.getBean("billService");
//		List<Bill> list = new ArrayList<Bill>();
//		Bill billCondition = new Bill();
//		billCondition.setProductName("洗发");
//		billCondition.setProviderId(13);
//		billCondition.setIsPayment(2);
//		list = service.findBillList(billCondition);
//		for (Bill bill : list) {
//			log.debug("订单编码："+bill.getBillCode()+"\n"
//					  +"商品名称："+bill.getProductName()+"\n"
//					  +"供应商名称："+bill.getProvider().getProName()+"\n"
//					  +"账单金额："+bill.getTotalPrice()+"\n"
//					  +"是否付款："+bill.getIsPayment()+"\n"
//					  +"创建时间："+bill.getCreationDate());
//		}
//	}
}
