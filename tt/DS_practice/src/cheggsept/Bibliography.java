package cheggsept;
public class Bibliography {
	private Publication[] publications;
	private int last;
	/**
	 *
	 */
	public Bibliography() {
		publications = new Publication[10];
		last = 0;
	}
	/**
	 *
	 */
	private void resize() {
		Publication[] publicationsNew = new Publication[2 * publications.length];
		System.arraycopy(publicationsNew, 0, publications, 0,
				publications.length);
		this.publications = publicationsNew;
	}
	/**
	 * @param pub
	 * @return
	 */
	public boolean add(Publication pub) {
		if (pub.canAdd()) {
			if (last == publications.length) {
				resize();
			}
			publications[last] = pub;
			last++;
			return true;
		} else
			return false;
	}
	public int capacity() {
		return publications.length;
	}
	public boolean deleteLast() {
		last--;
		return true;
	}
	/**
	 * @param whichOne
	 * @return
	 */
	public Publication get(int whichOne) {
		if (whichOne < last)
			return publications[whichOne];
		return null;
	}
	public int size() {
		return last;
	}
}