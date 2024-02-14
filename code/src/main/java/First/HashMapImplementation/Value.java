package First.HashMapImplementation;

import java.util.Objects;

public class Value {
	private int value;
	public Value(int v) {
		value = v;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return value == other.value;
	}
	
	

}
