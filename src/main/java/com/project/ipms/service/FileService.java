/**
 * Code for Spring Boot + Google Cloud Storage integration
 * From: https://www.knowledgefactory.net/2023/03/google-cloud-storage-spring-boot-file-upload-download-and-delete.html
 */

package com.project.ipms.service;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;

public interface FileService {
    /**
     * List of files.
     * @return A list of files in storage
     */
    List<String> listOfFiles();

    /**
     * Download file from Google Cloud Storage.
     * @param fileName Name of file
     * @return Byte Array File
     */
    ByteArrayResource downloadFile(String fileName);

    /**
     * Upload file to Google Cloud Storage.
     * @param file Representation of a file received in a multipart request
     * @throws IOException If file does not exist or filename is inappropriate
     */
    void uploadFile(MultipartFile file) throws IOException;
}
