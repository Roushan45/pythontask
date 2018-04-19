package cheggsept;
public class Publication {
	private String author;
	private String title;
	private String city;
	private String publisher;
	private int year;
	/**
	 * @param author
	 * @param title
	 * @param city
	 * @param publisher
	 * @param year
	 */
	public Publication(String author, String title, String city,
			String publisher, int year) {
		this.author = author;
		this.title = title;
		this.city = city;
		this.publisher = publisher;
		this.year = year;
	}
	/**
	 * @return
	 */
	public boolean canAdd() {
		if ((author != null && author.length() > 0)
				&& (title != null && title.length() > 0)
				&& (year >= 1450 && year <= 2018 && year != 0))
			return true;
		return false;
	}
	public String getAuthor() {
		return author;
	}
	public String getCity() {
		return city;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	/**
	 * @param author
	 * @return
	 */
	public boolean setAuthor(String author) {
		if (author != null && author.length() > 0) {
			this.author = author;
			return true;
		} else {
			this.author = "";
			return false;
		}
	}
	/**
	 * @param city
	 */
	public void setCity(String city) {
		if (city != null)
			this.city = city;
		else
			this.city = "";
	}
	/**
	 * @param publisher
	 */
	public void setPublisher(String publisher) {
		if (publisher != null)
			this.publisher = publisher;
		else
			this.publisher = "";
	}
	/**
	 * @param title
	 * @return
	 */
	public boolean setTitle(String title) {
		if (title != null && title.length() > 0) {
			this.title = title;
			return true;
		} else {
			this.title = "";
			return false;
		}
	}
	/**
	 * @param year
	 * @return
	 */
	public boolean setYear(int year) {
		if (year >= 1450 && year <= 2018 && year != 0) {
			this.year = year;
			return true;
		} else
			return false;
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Publication [author=" + author + ", title=" + title + ", city="
				+ city + ", publisher=" + publisher + ", year=" + year + "]";
	}
}
