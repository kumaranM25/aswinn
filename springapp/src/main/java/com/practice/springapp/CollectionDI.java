package com.practice.springapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDI {
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties prop;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	void display(){
		System.out.println("List : "+list.toString());
		System.out.println("Set : "+set.toString());
		System.out.println("Map : "+map.toString());
		System.out.println("Properties : "+prop.toString());
	}

}
