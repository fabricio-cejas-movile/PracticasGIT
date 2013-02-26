package com.practicas.git.cache;

public interface Cache {
	
	Object get(final Object key);
	Object put(final Object key, final Object value);
	
}
