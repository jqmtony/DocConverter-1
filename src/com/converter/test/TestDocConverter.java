package com.converter.test;

import com.converter.pdfConverter.OpenOfficePDFConverter;

public class TestDocConverter {
	public static void main(String[]args){
		//PDFConverter pdfConverter = new OpenOfficePDFConverter();
		//PDFConverter pdfConverter = new JacobPDFConverter();
		OpenOfficePDFConverter pdfConverter = new OpenOfficePDFConverter();
//		SWFConverter swfConverter = new SWFToolsSWFConverter();
//		DocConverter converter = new DocConverter(pdfConverter,swfConverter);
		String txtFile1 = "C:\\Users\\YZL\\Desktop\\test\\a.docx";
		String txtFile2 = "C:\\Users\\YZL\\Desktop\\test\\b.doc";
		String txtFile3 = "C:\\Users\\YZL\\Desktop\\test\\c.xls";
		pdfConverter.convert2PDF(txtFile1);
		pdfConverter.convert2PDF(txtFile2);
		pdfConverter.convert2PDF(txtFile3);
//		converter.convert(txtFile);
//		converter.convert(docFile);
//		converter.convert(xlsFile);
//		converter.convert(pptFile);
	}
}
