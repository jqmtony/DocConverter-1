package com.openoffice.docConverter;

import com.openoffice.pdfConverter.PDFConverter;
import com.openoffice.swfConverter.SWFConverter;
import com.openoffice.utils.FileUtils;

public class DocConverter {

	private PDFConverter pdfConverter;
	private SWFConverter swfConverter;
	
	
	public DocConverter(PDFConverter pdfConverter, SWFConverter swfConverter) {
		super();
		this.pdfConverter = pdfConverter;
		this.swfConverter = swfConverter;
	}


	public  void convert(String inputFile,String swfFile){
		this.pdfConverter.convert2PDF(inputFile);
		String pdfFile = FileUtils.getFilePrefix(inputFile)+".pdf";
		this.swfConverter.convert2SWF(pdfFile, swfFile);
	}
	
	public void convert(String inputFile){
		this.pdfConverter.convert2PDF(inputFile);
		String pdfFile = FileUtils.getFilePrefix(inputFile)+".pdf";
		this.swfConverter.convert2SWF(pdfFile);
		
	}
	
}
