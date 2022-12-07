package com.busecnky.kasim24.imageDosyasiKopyalamaProjesi043;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;

public class DosyaKopyalayiciGurayHoca {

	



	   
	    public static ArrayList<Integer> dosyaIcerigiByteList = new ArrayList<Integer>();
	    
	    
	    public static void dosyaOku(String dosyaAdi) {



	       // FileInputStream binary olarak dosyalaır okur ve yazar...
	        FileInputStream fileInputStream = null;
	        
	        try {
	            
	            fileInputStream = new FileInputStream(dosyaAdi);
	            
	            int okunan;
	            
	            while ((okunan = fileInputStream.read()) != -1)
	            {
	                dosyaIcerigiByteList.add(okunan);
	            }
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("Dosya bulunamadı");
	        } catch (IOException e) {
	            System.out.println("Dosya okuma hatası");        
	        } catch (Exception e) {
	            System.out.println("Bilinemeyen bir hata oluştu");
	        }
	        finally {
	            if (fileInputStream != null) {
	                try {
	                    fileInputStream.close();
	                } catch (IOException e) {
	                    System.out.println("File close sırasında exception oluştu!");
	                }
	            }
	        }
	        
	    }
	    
	    
	    



	   private static void kopyala(String dosyaIsmi) {



	       FileOutputStream fileOutputStream = null;
	        
	        try {
	            
	            fileOutputStream = new FileOutputStream(dosyaIsmi);
	            
	            for (int deger : dosyaIcerigiByteList) {
	                fileOutputStream.write(deger);
	            }
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("Dosya bulunamadı!");
	        } catch (IOException e) {
	            System.out.println("Dosya ayzarken hata oluştu!");
	        } catch (Exception e) {
	            System.out.println("Bilienemeyen bir hata oluştu!");
	        }
	        finally {
	            if (fileOutputStream != null) {
	                try {
	                    fileOutputStream.close();
	                } catch (IOException e) {
	                    System.out.println("File close sırasında exception oluştu!");
	                }
	            }
	        }
	        
	    }
	    
	    
	    
	    public static void main(String[] args) {
	    
	        DosyaKopyalayici.dosyaOku("C:\\test\\r2d2.jpg");
	        
	        DosyaKopyalayici.kopyala("c:\\test\\rdd2_kopya1.jpg");
	        DosyaKopyalayici.kopyala("c:\\test\\rdd2_kopya2.jpg");
	        DosyaKopyalayici.kopyala("c:\\test\\rdd2_kopya3.jpg");
	        
	    }






	}
	
	

