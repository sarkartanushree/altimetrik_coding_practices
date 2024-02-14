package First.HashMapImplementation;

import java.util.Objects;

public class Key {

	private int key;
	public Key(int k)
	{
		key = k;
	}
	@Override
	public int hashCode() {
		return Objects.hash(key);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return key == other.key;
	}
	
	
}
