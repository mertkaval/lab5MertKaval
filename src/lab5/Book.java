package lab5;

public class Book implements Comparable<Book>{

	private static final int MAX_YEAR_PUBLISHED=2017;
	
	Name firstName;
	
	Name lastName;
	
	String title;
	
	int yearPublished;

	
	
	
	
	
	
	public Book(Name firstName, Name lastName, String title, int yearPublished)throws Exception {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.yearPublished = yearPublished;
	}

	/**
	 * @return the firstName
	 */
	public final Name getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public final void setFirstName(Name firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public final Name getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public final void setLastName(Name lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the title
	 */
	public final String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) throws Exception{
		
		if(title==null) {
			throw new InvalidArgumentException("something is wrong.");
		}
		
		if(title.length()==0) {
			throw new InvalidArgumentException("something is wrong.");
		}
		
		this.title = title;
	}

	/**
	 * @return the yearPublished
	 */
	public int getYearPublished() {
		return yearPublished;
	}

	/**
	 * @param yearPublished the yearPublished to set
	 */
	public void setYearPublished(int yearPublished) throws Exception{
		if(yearPublished>MAX_YEAR_PUBLISHED) {
			
			throw new InvalidBookDateException("Something is wrong about year.");
		}
		
		this.yearPublished = yearPublished;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
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
		Book other = (Book) obj;
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (yearPublished != other.yearPublished) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", yearPublished="
				+ yearPublished + "]";
	}

	@Override
	public int compareTo(Book other) {
		// TODO Auto-generated method stub
		if(other.getYearPublished()>this.getYearPublished()) {
			return -1;
			
		}
		else if(other.getYearPublished()<this.getYearPublished()) {
			return 1;
		}
		
		return 0;
	}
	
	

	
	
}
