/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.mirrorVerticalRightToLeft();
	beach.explore();
  }
  public static void testMirrorHorizontal()
  {
	Picture motorcycle = new Picture("motorcycle.jpg");
    motorcyle.explore();
    motorcyle.mirrorHorizontal();
    motorcycle.explore();
  }
  public static void testMirrorHorizontalBotToTop(
  {
    Picture motorcycle = new Picture("motorcycle.jpg");
    motorcyle.explore();
    motorcyle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  )
  
  public static void testMirrorTemple()
  {
	  Picture temple = new Picture("temple.jpg");
	  temple.explore();
	  temple.mirrorTemple();
	  temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorTemple();
	  snowman.explore(); 
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore(); 
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public void testKeepOnlyBlue()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.KeepOnlyBlue();
    beach.explore();
  }
  public static void testNegate()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Negate();
    beach.explore();
  }
  
  public static void testGrayscale()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.Grayscale();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
	Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.FixUnderwater();
    beach.explore(); 
  }
  
  public static void testCollage()
  {
	  Picture canvas = newPicture("640x480.jpg");
	  canvas.createCollage();
	  canvas.explore();
  }
  
  public static void testmyCollage()
  {
	  
  }
  public static void testCopy()
  {
	  Picture canvas = newPicture("640x480.jpg");
	  canvas.createCollage();
	  canvas.explore(); 
  }
  
  public static void testEdgeDetection()
  {
	  Picture swan = new Picture("swan.jpg");
	  swan.explore();
	  swan.edgeDetection(27);
	  swan.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	testMirrorHorizontalBotToTop();
	testMirrorVerticalRightToLeft();
	testMirrorHorizontal();
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}