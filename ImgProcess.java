/*
 * To compare images
 * @author Ramya
 */
package imgprocess;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.DMatch;
import org.opencv.highgui.Highgui;
/**
 *
 * @author Ramya
 */

public class ImgProcess {

 public static void main(String[] args) {
     Comp compare = new Comp();
     compare.setVisible(true);
 }
}