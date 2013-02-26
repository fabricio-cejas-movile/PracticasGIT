package com.practicas.git.cache;

import java.util.Map;

import cacheonix.Cacheonix;

public class CacheImplementation implements Cache {
	
	final Cacheonix cacheManager = Cacheonix.getInstance();
	final Map cache = cacheManager.getCache("First");
	
	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
