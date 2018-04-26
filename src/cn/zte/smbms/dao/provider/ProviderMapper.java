package cn.zte.smbms.dao.provider;

import java.util.List;

import cn.zte.smbms.pojo.Provider;


public interface ProviderMapper {
	public List<Provider> getBillListByProvider(Provider provider);
	public List<Provider> providerList(Provider provider);
	public int addProvider(Provider provider);
	public int update(Integer id);
}
