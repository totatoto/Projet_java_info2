package fr.ensibs.graphic;

/**
 * Manage the display of images on the device
 */
public interface Graphic<ImageType> {
  
  /**
   * Display the specified image on the screen of the device
   * @param image the image to display
   * @pre image != null
   */
  void display(ImageType image);
}
