package com.thinkitive.reebokshop.exception;

public class UploadFileResponse {

	private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

	@Override
	public String toString() {
		return "UploadFileResponse [fileName=" + fileName + ", fileDownloadUri=" + fileDownloadUri + ", fileType="
				+ fileType + ", size=" + size + "]";
	}
    
    

}
