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
//		billCondition.setProductName("ϴ��");
//		billCondition.setProviderId(13);
//		billCondition.setIsPayment(2);
//		list = service.findBillList(billCondition);
//		for (Bill bill : list) {
//			log.debug("�������룺"+bill.getBillCode()+"\n"
//					  +"��Ʒ���ƣ�"+bill.getProductName()+"\n"
//					  +"��Ӧ�����ƣ�"+bill.getProvider().getProName()+"\n"
//					  +"�˵���"+bill.getTotalPrice()+"\n"
//					  +"�Ƿ񸶿"+bill.getIsPayment()+"\n"
//					  +"����ʱ�䣺"+bill.getCreationDate());
//		}
//	}
}
