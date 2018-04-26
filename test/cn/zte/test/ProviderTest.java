package cn.zte.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zte.smbms.pojo.Bill;
import cn.zte.smbms.pojo.Provider;
import cn.zte.smbms.service.provider.ProviderService;


public class ProviderTest {
	private Logger log = Logger.getLogger(UserTest.class);
	public ProviderTest() {
		
	}
	@Test
	public void testProvider() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProviderService pservice =(ProviderService)context.getBean("providerService");
		List<Provider> list = new ArrayList<Provider>();
		Provider providerCondition = new Provider();
		providerCondition.setProName("三木堂");
		list = pservice.findProviderwithCondition(providerCondition);
		for (Provider p : list) {
			log.debug("供应商id\t"+p.getId()+"\n"+"供应商编码\t"+p.getProCode()+"\n"+"供应商名字\t"+p.getProName()+"\n"+"供应商联系人\t"+p.getProContact()+"\n"+"供应商联系电话\t"+p.getProPhone());
			for(Bill b : p.getBillList()) {
				log.debug("biilCode\t"+b.getBillCode()+"\n"+"productName\t"+b.getProductName()+"\n"+"totalPrice\t"+b.getTotalPrice()+"\n"+"isPayment\t"+b.getIsPayment());
			}
		}
	}
	@Test
	public void testList() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProviderService pservice =(ProviderService)context.getBean("providerService");
		List<Provider> list = new ArrayList<Provider>();
		Provider p = new Provider();
		p.setProName("北京");
		list =  pservice.findProviderList(p);
		for (Provider provider : list) {
			log.debug("供应商代码："+provider.getProCode()+"\t"+"供应商名称："+provider.getProName());
		}
	}
	@Test
	public void testList2() throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextProvider.xml");
		ProviderService providerservice =(ProviderService)context.getBean("providerService");
		Provider provider = new Provider();
		provider.setProCode("JI_JI4565");
		provider.setProName("江西工业职业技术学院");
		provider.setProDesc("主要生产大学僧");
		provider.setCreatedBy(2);
		Date creationDate =new SimpleDateFormat("yyyy-MM-dd").parse("1998-02-11 10:23:11");
		provider.setCreationDate(creationDate);
		boolean flag = providerservice.add(provider);
		log.debug("添加供应商信息"+flag);
	}
}
