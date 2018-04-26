package cn.zte.smbms.service.provider;

import java.util.List;

import cn.zte.smbms.pojo.Provider;


public interface ProviderService {
	public List<Provider> findProviderwithCondition(Provider provider);
	public List<Provider> findProviderList(Provider provider);
	public boolean add(Provider provider);
	public boolean update(Integer id);
}
