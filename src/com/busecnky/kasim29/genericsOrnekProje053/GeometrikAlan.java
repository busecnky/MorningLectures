package com.busecnky.kasim29.genericsOrnekProje053;

public class GeometrikAlan<T , G> {
				//Araya virgül koyup istediğimiz kadar ekleyebiliriz (2,3 tane örneğin ideal)
	
	T obj1;
	G obj2;
	
	public GeometrikAlan(T object1, G object2) {
		this.obj1 = object1;
		this.obj2 = object2;

	}

	
	public int geometrikSeklinAlaniniHesapla() {
		//Cast Etme / Casting:
		Sekil sekil1 = (Sekil) obj1;     //Bunu cast ederek içindeki alanhesapla metoduna ulaşabilirim.
		Sekil sekil2 = (Sekil) obj2;
		int toplamAlan = sekil1.alanHesapla() + sekil2.alanHesapla();
		return toplamAlan;
		
	}
	
	
	
	public T getObj1() {
		return obj1;
	}

	public void setObj1(T obj1) {
		this.obj1 = obj1;
	}

	public G getObj2() {
		return obj2;
	}

	public void setObj2(G obj2) {
		this.obj2 = obj2;
	}
	
	
	
	
	
	
}
