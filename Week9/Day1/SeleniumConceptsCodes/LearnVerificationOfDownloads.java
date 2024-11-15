package sample;

import java.io.File;

public class LearnVerificationOfDownloads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "U should give the file path here";
		 
        // Create a File object
        File file= new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists at: " + filePath);
        } else {
            System.out.println("The file does not exist at: " + filePath);
        }


	}

}
