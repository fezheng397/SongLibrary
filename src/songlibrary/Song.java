/**
 * Written by Marco Vlajnic and Felix Zheng 
 */
package songlibrary;

public class Song implements Comparable<Song> {
	private String name;
	private String album;
	private String year;
	private String artist;
	
	public Song (String name, String album, String year, String artist) {
		this.name = name;
		this.album = album;
		this.year = year;
		this.artist = artist;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	
	public void setYear(String year) {
		this.year = year;
	}
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		Song mysong = (Song) obj;
		return name.equals(mysong.name) && artist.equals(mysong.artist);
	}
	
	public int compareTo(Song obj) {
		return name.toLowerCase().compareTo(obj.name.toLowerCase());
	}
}
