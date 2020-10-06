package SpringCollectionInjection.SpringCollectionInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {

	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	public List getAddressList() {
		System.out.println("address List :  "+addressList);
		return addressList=addressList;
	}
	
	public void setAddressList(List addressList) {
		this.addressList=addressList;
	}
	
	public Set getAddressSet() {
		System.out.println("Address Set :  "+addressSet);
		return addressSet;
	}
	
	public void setaddressSet(Set addressSet) {
		this.addressSet=addressSet;
	}
	
	public Map getAddressMap() {
		System.out.println("address Map : "+addressMap);
		return addressMap;
	}
	
	
	public void setAddressMap(Map addressMap) {
		this.addressMap=addressMap;
	}
	
	
	public Properties getAddressProp() {
		System.out.println("address properties : "+addressProp);
		return addressProp;
	}
	
	public void setAddressProp(Properties addressProp) {
		this.addressProp=addressProp;
	}
}
