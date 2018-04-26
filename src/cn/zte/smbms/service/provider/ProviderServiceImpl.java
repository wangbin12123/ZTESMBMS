package cn.zte.smbms.service.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zte.smbms.dao.provider.ProviderMapper;
import cn.zte.smbms.pojo.Provider;
@Transactional
@Service("providerService")
public class ProviderServiceImpl implements ProviderService{
	@Autowired
	public ProviderMapper providerMapper;
	
	public ProviderMapper getProviderMapper() {
		return providerMapper;
	}

	public void setProviderMapper(ProviderMapper providerMapper) {
		this.providerMapper = providerMapper;
	}

	@Override
	public List<Provider> findProviderwithCondition(Provider provider) {
		try {
			return providerMapper.getBillListByProvider(provider);
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public List<Provider> findProviderList(Provider provider) {
		try {
			return providerMapper.providerList(provider);
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean add(Provider provider) {
		boolean flag = false;
		try {
			if(providerMapper.addProvider(provider)==1) {
				flag = true;
			}
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}

	@Override
	public boolean update(Integer id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			if(providerMapper.update(id)==1) {
				flag = true;
			}
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}

}
