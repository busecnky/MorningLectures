package com.busecnky.aralik06.polymorphismGenelTekrar.araclar;

public abstract class Tasit {
	
	String marka;
			
	
	
	public Tasit(String mark)
	{
		//System.out.println("Tasit parametreli constrcutor çağırıldı..");
		this.marka = mark;
	}
	
	public void aracaHavaBas(int basincDegeri) {
		System.out.println(this.marka + " marka araca hava basılıyor, basınç: " + basincDegeri + " pascal");
	}
	
	public abstract void sur();
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	

}
