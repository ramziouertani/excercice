package org.my.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.commons.io.IOUtils;

public class Refactoring {

	public String loadFileFromPathToTmp(String file) throws IOException {
		
		Logger log = LoggerFactory.getLogger(Refactoring.class);
		
		File inputFile = new File(file);
		if (!inputFile.exists())
			throw new FileNotFoundException();
		
		File outputFile = null;
		try {
			outputFile = File.createTempFile("mytemp", ".tmp");
		} catch (IOException e) {
			log.info("IOException occured");
		}
	
		try(FileInputStream	is = new FileInputStream(inputFile);
				FileOutputStream os = new FileOutputStream(outputFile);)
		{
			if(outputFile.exists()) {
				IOUtils.copy(is, os);
				return outputFile.getAbsolutePath();
			}
			return null;
		}
	}

}
