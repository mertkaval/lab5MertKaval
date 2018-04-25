package lab5;

public class Biography extends Book {

	String subject;

	public Biography(Name firstName, Name lastName, String title, int yearPublished, String subject) throws Exception {
		super(firstName, lastName, title, yearPublished);
		this.subject = subject;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Biography other = (Biography) obj;
		if (subject == null) {
			if (other.subject != null) {
				return false;
			}
		} else if (!subject.equals(other.subject)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Biography [subject=" + subject + ", firstName=" + firstName + ", lastName=" + lastName + ", title="
				+ title + ", yearPublished=" + yearPublished + ", getSubject()=" + getSubject() + ", hashCode()="
				+ hashCode() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getTitle()=" + getTitle() + ", getYearPublished()=" + getYearPublished();
	}
	
	
}
