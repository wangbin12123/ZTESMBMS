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
		providerCondition.setProName("��ľ��");
		list = pservice.findProviderwithCondition(providerCondition);
		for (Provider p : list) {
			log.debug("��Ӧ��id\t"+p.getId()+"\n"+"��Ӧ�̱���\t"+p.getProCode()+"\n"+"��Ӧ������\t"+p.getProName()+"\n"+"��Ӧ����ϵ��\t"+p.getProContact()+"\n"+"��Ӧ����ϵ�绰\t"+p.getProPhone());
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
		p.setProName("����");
		list =  pservice.findProviderList(p);
		for (Provider provider : list) {
			log.debug("��Ӧ�̴��룺"+provider.getProCode()+"\t"+"��Ӧ�����ƣ�"+provider.getProName());
		}
	}
	@Test
	public void testList2() throws ParseException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextProvider.xml");
		ProviderService providerservice =(ProviderService)context.getBean("providerService");
		Provider provider = new Provider();
		provider.setProCode("JI_JI4565");
		provider.setProName("������ҵְҵ����ѧԺ");
		provider.setProDesc("��Ҫ������ѧɮ");
		provider.setCreatedBy(2);
		Date creationDate =new SimpleDateFormat("yyyy-MM-dd").parse("1998-02-11 10:23:11");
		provider.setCreationDate(creationDate);
		boolean flag = providerservice.add(provider);
		log.debug("��ӹ�Ӧ����Ϣ"+flag);
	}
}
