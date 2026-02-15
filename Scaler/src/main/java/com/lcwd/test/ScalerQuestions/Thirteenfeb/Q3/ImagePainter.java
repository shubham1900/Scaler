package com.lcwd.test.ScalerQuestions.Thirteenfeb.Q3;
/*Image Painter
Implement a Java program that simulates image re-painting using 4 threads. The algorithm for painting is described as under but your task is given an image, divide the image into 4 quadrants and let each thread paint one quadrant of the image. The concurrent execution ensures image is painted efficiently.

Problem Statement:
You are provided a function paintImage. This function is designed to paint a square image, represented as a 2D integer array, where each integer represents a color. The goal is to paint the image in such a way that each quadrant of the image has a different color. The painting process for each quadrant should be performed concurrently using multiple threads.

Tasks:
Implement the paintImage function
Divide the given image into four quadrants.
Paint each quadrant with a different color.
The base color will be provided as an input to the painting method, and each quadrant should use a variation of this base color.
For first quadrant the color should be same as the given base color.
For second quadrant the color should be equal to 2*base color.
For third quadrant the color should be equal to 3*base color.
For fourth quadrant the color should be equal to 4*base color
Instructions
The image is represented as a 2D integer array.
Use a fixed thread pool size of 4 threads in your ExecutorService.
Handle any potential exceptions that may arise during the execution.
Implement the paintImage function and the constructor in the ImagePainter class.
Use Java's ExecutorService to execute the painting of each quadrant in a separate thread.
Ensure that the program waits for all quadrants to be fully painted before proceeding.
Properly shutdown your ExecutorService after the painting is completed to avoid any resource leaks.*/
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class ImagePainter {
    static ExecutorService executor;
    private final int[][] image;

    //Todo: Initialise the Image and create an executor with fixed thread pool size = 4
    public ImagePainter(int[][] image) {
        this.image = image;
        executor = Executors.newFixedThreadPool(4);
    }

    public void paintImage(int color) throws InterruptedException {
        int rows = image.length;
        int cols = image[0].length;
        int halfRows = rows / 2;
        int halfCols = cols / 2;

        // A sample quadrant call will look like this, here we are using the lambda function to pass a runnable!
        Future<?> q1 = executor.submit(() -> paintQuadrant(0, halfRows, 0, halfCols, color)); // Top-left quadrant
        Future<?> q2 = executor.submit(() -> paintQuadrant(0, halfRows, halfCols, cols, 2*color)); // Top-right quadrant
            Future<?> q3 = executor.submit(() -> paintQuadrant(halfRows, rows, 0, halfCols, 3*color)); // Bottom-left quadrant
            Future<?> q4 = executor.submit(() -> paintQuadrant(halfRows, rows, halfCols, cols, 4*color)); // Bottom-right quadrant

        // TODO: Submit remaining 3 tasks to paint each quadrant of the image



        try{
            // Todo: Wait for the tasks to finish by calling the .get() method of future objects
            q1.get();
            q2.get();
            q3.get();
            q4.get();


        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //Todo: Shutdown the executor once all tasks have been done
        executor.shutdown();
    }

    private void paintQuadrant(int startRow, int endRow, int startCol, int endCol, int color) {
       for(int i=startRow;i<endRow;i++){
           for(int j=startCol;j<endCol;j++){
               image[i][j] = color;
           }
       }
    }

    public int[][] getImage() {
        return image;
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] image = new int[4][4]; // Example 4x4 image
        ImagePainter painter = new ImagePainter(image);
        painter.paintImage(1);

        int[][] paintedImage = painter.getImage();
        // Print the painted image (for demonstration purposes)
        for (int[] row : paintedImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}


