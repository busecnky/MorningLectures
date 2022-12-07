package com.busecnky.kasim29.serializationSerialVersionUID049;

import java.io.Serializable;

public class Otomobil implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String marka;
	private String model;
	private int yil;
	private int motorHacmi; // bu parametreyi getter setter larını ekleyip oku dediğimizde serialVersionUID
							// farklı ben bunu okuyamam hatası alırız.
							// bu farklılığı ortadan kaldırmak için serialVersionUID ile biz farklılık
							// yaptığımız zaman serialize edip yazsak sonra da okursak aynı serialize number ile
							// o zaman sıkıntı kalmaz. Ancak örneğin serialVersionUID = 1 ile ben yazdım ve
							// okudum her ikisinde durum 1, sonrasında motorHacmini ve getter setterlarını ekledim
							// bu UID'yi = 2 yaptım. Eğer yazmadan okursam hata alırım sistem der ki:
							//benim okuduğum nesne ile yazılan farklı.
							//O yüzden version 2 yaptık diyelim bir değişiklikten sonra. O yüzden
							//1- değişiklik yap
							//2- versionUID güncelle
							//3-dosyaya yazı çalıştır
							//4-dosyayı oku
	
	

	public Otomobil(String marka, String model, int yil) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}

	@Override
	public String toString() {
		String ozellikler = "Araba markası: " + marka + ", modeli=" + model + ", yılı=" + yil + "]";
		return ozellikler;
	}

	public int getMotorHacmi() {
		return motorHacmi;
	}

	public void setMotorHacmi(int motorHacmi) {
		this.motorHacmi = motorHacmi;
	}

}
