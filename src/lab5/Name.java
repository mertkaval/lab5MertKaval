package lab5;

/**
 * Name class
 * 
 * @author Mert Kaval
 *
 */
public class Name {

	String name;

	/**
	 * @return the name(first name or last name)
	 */
	public Name(String name) throws Exception {

		setName(name) ;
	}

	/**
	 * @param name
	 *            the name to set
	 * @throws InvalidArgumentException
	 */
	public void setName(String name) throws InvalidArgumentException {
		if (name == null) {
			throw new InvalidArgumentException("Something is wrong.Try again");
		}

		if (name.length() == 0) {

			throw new InvalidArgumentException("Something is wrong.Try again");

		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Name other = (Name) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}

	
}
