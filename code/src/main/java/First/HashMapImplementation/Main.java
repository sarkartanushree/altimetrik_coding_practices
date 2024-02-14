package First.HashMapImplementation;

public class Main {

	public static void main(String[] args) {
		HashMapImp map = new HashMapImp();
		map.put(new Key(18), new Value(20));
		map.put(new Key(40), new Value(200));
		map.put(new Key(10), new Value(4302));
		
		//map.remove(new Key(10));
		System.out.println(map.containsKey(new Key(40)));
		
		if(map.containsKey(new Key(10))) {
		System.out.println(map.get(new Key(10)).getValue());}
		System.out.println(map.get(new Key(40)).getValue());

	}

}
