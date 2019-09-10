package fr.ensibs.graphic;

import java.awt.Dimension;

/**
 * This represent an image that can be loaded from the file system and then display on the screen
 */ 
public interface Image {
  
  /**
   * Get the name of the image
   * @return the name of the image
   * @post return != null && return not empty (return.length() > 0)
   */
  String getName();
  
  /**
   * Get the width of the image
   * @return the width of the image
   * @post return > 0
   */
  int getWidth();
  
  /**
   * Get the height of the image
   * @return the height of the image
   * @post return > 0
   */
  int getHeight();
  
  /**
   * Get the dimension of the image
   * @return the dimension of the image
   * @post return.width == getWidth() && return.height == getHeight() && return.width > 0 && return.height > 0
   */
  Dimension getDimension();
}
