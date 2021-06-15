package it.uniroma3.siw.spring.service;


import javax.transaction.Transactional;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import it.uniroma3.siw.spring.repository.ArtistaRepository;

@Service
public class FileUploadService {

	
	@Transactional
	public void uploadFile(File file, String name, Long id) throws IllegalStateException, IOException {
			//	transferTo(new File("C:\\Users\\elisa\\Desktop\\Importante\\studio\\università\\01. Triennale\\SIW\\progetti\\progettoMuseo\\SIW_Museo\\src\\main\\resources\\static\\image" + name + id));
			
		
	}

}
