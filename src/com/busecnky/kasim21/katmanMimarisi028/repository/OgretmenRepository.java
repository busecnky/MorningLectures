package com.busecnky.kasim21.katmanMimarisi028.repository;

import java.util.List;

import com.busecnky.kasim21.katmanMimarisi028.repository.entity.Ogretmen;
import com.busecnky.kasim21.katmanMimarisi028.utility.DataBase;

public class OgretmenRepository {
    
    
    public void save(Ogretmen ogretmen) {
        DataBase.ogretmenListesi.add(ogretmen);
     
    }
    
    
    public void update(Ogretmen ogretmen) {
        for (int i=0;i<DataBase.ogretmenListesi.size();i++) {
            if (DataBase.ogretmenListesi.get(i).getTcKimlikNo() == ogretmen.getTcKimlikNo());
            {
                DataBase.ogretmenListesi.get(i).setAdi(ogretmen.getAdi());
                DataBase.ogretmenListesi.get(i).setSoyadi(ogretmen.getSoyadi());                
            }
        }
    }
    
    
    public void delete(int tcKimlikNo) {
        Ogretmen silinecekOgretmen = null;
                
        for (Ogretmen ogr : DataBase.ogretmenListesi) {
            if (ogr.getTcKimlikNo() == tcKimlikNo)
            {
                silinecekOgretmen = ogr;
                break;
            }
        }
        
        if (silinecekOgretmen != null) {
            DataBase.ogretmenListesi.remove(silinecekOgretmen);
        }
    }
    
    
    public List<Ogretmen> findAll() {
        return DataBase.ogretmenListesi;
    }
    
    public Ogretmen findById(int id) {
        Ogretmen tempOgretmen = null;
        
        for (Ogretmen ogr : DataBase.ogretmenListesi) {
            if (ogr.getTcKimlikNo() == id)
            {            
                tempOgretmen = ogr;
                break;
            }
        }
        return tempOgretmen;
    }
	
	
	
}
