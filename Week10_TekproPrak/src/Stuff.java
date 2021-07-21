package iniPackage1;

/*generic class*/
class Var <T> {
	private T data;
	public void set(T data) {
		this.data = data;
	}
	public T get () {
		return this.data;
	}
}

/*generic interface*/
interface IdAndValue<K extends Comparable<K>,V>{ 
	public void setKey(K key);
	public void setValue(V value);
	public K getKey();
	public V getValue();
}

/*generic bound type parameter*/
public class Stuff<K extends Comparable<K>, V> implements IdAndValue<K,V>{ 
	private Var<K> key; 
	private Var<V> value; 
	
	public Stuff(K key, V value) { 
		this.key = new Var<K>();
		this.value = new Var<V>();
		this.setKey(key);
		this.setValue(value);
	}
	@Override
	public void setKey(K key) {
		this.key.set(key);
	}
	@Override
	public void setValue(V value) {
		this.value.set(value);
	}
	@Override
	public K getKey() {
		return this.key.get();
	}
	@Override
	public V getValue() {
		return this.value.get();
	}
}

