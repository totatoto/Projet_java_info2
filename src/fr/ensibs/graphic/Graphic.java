package fr.ensibs.graphic;

import fr.ensibs.graphic.Image;

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
