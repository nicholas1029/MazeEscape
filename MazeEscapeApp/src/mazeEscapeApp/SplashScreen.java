package mazeEscapeApp;

import javax.swing.*;

/**
 * Splash screen displayed before MazeEscapeApp is loaded fully
 * @author Mohamed Bhura
 *
 */
public class SplashScreen {
	protected JFrame load;
	protected JLabel icon;
	protected JLabel status;
	protected JLabel version;
	protected JProgressBar pbar;
	
	/*
	 * Default constructor
	 */
	public SplashScreen(ImageIcon image) {
		//this(image, "");
	}
	
	public SplashScreen() {		
		load = new JFrame();
		load.setLayout(new BoxLayout(load.getContentPane(), BoxLayout.Y_AXIS));
		
		// gets the image from resource directory
		ImageIcon image = new ImageIcon(this.getClass().getResource("/resources/ESCAPE.gif"));
		System.out.println("Reached");
		this.icon = new JLabel(image);
		// adds the image to the frame
		load.add(icon);	
		
		String vers = "Version 1.1";
		this.version = new JLabel(vers);
		// adds the version number to frame
		load.add(version);
		
		String stat = "Loading: ";
		this.status = new JLabel(stat);
		// adds the status to the frame
		load.add(status);
		
		pbar = new JProgressBar(0, 100);
		// adds the progress bar to the frame
		load.add(pbar);	
		
		// prevents the window from being decorated with extras
		load.setUndecorated(true);
		// sets the size of screen to be exactly of image with added progress bar
		load.setSize(image.getIconWidth(), image.getIconHeight() + 40);
	}
	
	/*
	 * Displays the splash screen and centers it
	 */
	public void show() {
		load.setLocationRelativeTo(null);
		load.setVisible(true);
	}
	
	/*
	 * Sets value of the progress bar
	 */
	public void setProgress(int p) {
		pbar.setValue(p);
	}
	
	/*
	 * Returns value of the progress bar
	 */
	public int getProgress() {
		return pbar.getValue();
	}
	
	/*
	 * Sets the status text of image
	 */
	public void setStatus(String stat) {
		this.status.setText(stat);
	}
	
	/*
	 * Returns status text
	 */
	public String getStatus() {
		return status.getText();
	}
	
	/*
	 * Sets the application version
	 */
	public void setVersion(String stat) {
		this.version.setText(stat);
	}
	
	/*
	 * Returns application version
	 */
	public String getVersion() {
		return version.getText();
	}
	
	/*
	 * Sets the image of the splash screen
	 */
	public void setIcon(Icon icon) {
		this.icon.setIcon(icon);
	}
	
	/*
	 * Returns the image of the splash screen
	 */
	public Icon getIcon() {
		return icon.getIcon();
	}
	
	/*
	 * Hides the splash screen after program loads
	 */
	public void close() {
		load.setVisible(false);
	}
}