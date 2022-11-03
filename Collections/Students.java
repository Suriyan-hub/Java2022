package Collections;

import java.util.Objects;

public class Students {

	public String name;
	public int rno;
	public Students(String name,int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Students))
			return false;
		Students other = (Students) obj;
		return Objects.equals(name, other.name) && rno == other.rno;
	}
	
	
	
	
}
