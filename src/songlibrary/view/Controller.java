/**
 * 
 */
package songlibrary.view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import songlibrary.app.Song;

/**
 * @author Marco Vlajnic
 *
 */
public class Controller {
	private Song currentSong;
	
	@FXML private ListView<Song> songList;
	@FXML private Button deleteSong;
	@FXML private Button addSong;
	@FXML private Button saveSong;
	
	@FXML private TextField songName;
	@FXML private TextField songArtist;
	@FXML private TextField songAlbum;
	@FXML private TextField songYear;
	
}
