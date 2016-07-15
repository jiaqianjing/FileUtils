package com.buaa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.buaa.utils.FileUtils;

public class TestMain {
	public static void main(String[] args) throws Exception {

		String filename = "D:/myFile/test/audio_dataType_0";

		byte[] test = FileUtils.toByteArray(filename);

		File file = new File("d:" + File.separator + "myFile" + File.separator
				+ "test" + File.separator + "hello.txt");
		
		OutputStream output = new FileOutputStream(file);
//	 	output.write(test, 8113, 6710);
//	 	output.write(test, 732, 7381);
	 	output.write(test, 21289, 4148);
		output.close();

	}

}
