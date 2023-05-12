
package cokbicimliliksoru2radyo;

public class Radyo
{
    final static int enYuksekSesSeviyesi = 100;
final static int enDusukSesSeviyesi = 0;
private int simdikiSesSeviyesi;
private double simdikiFrekans;
private boolean acik;
public Radyo()
{ 
    acik = false; 
    simdikiSesSeviyesi = 50; 
    simdikiFrekans = 99.0;
}

public Radyo(boolean basDurumu, int basSesSeviyesi, double basFrekansi) 
{
    
acik = basDurumu; 
simdikiSesSeviyesi = basSesSeviyesi;
simdikiFrekans = basFrekansi; 

}
public void acKapat() 
{ acik = (acik == true) ? false : true; }



public void sesArtir(int artirmaMiktari) 
{
if(acik == true) 
{
if (artirmaMiktari + simdikiSesSeviyesi > enYuksekSesSeviyesi)
simdikiSesSeviyesi = enYuksekSesSeviyesi;
else
simdikiSesSeviyesi = artirmaMiktari + simdikiSesSeviyesi;
}

}
public void sesAzalt(int azaltmaMiktarı) 
{
if (acik == true) 
{
if (simdikiSesSeviyesi - azaltmaMiktarı < enDusukSesSeviyesi)
simdikiSesSeviyesi = enDusukSesSeviyesi;
else
simdikiSesSeviyesi = simdikiSesSeviyesi - azaltmaMiktarı;
}

}
public void frekansDegis(double yeniFrekans)
{
if (acik == true) { simdikiFrekans = yeniFrekans; }
else { System.out.println("Radyo Kapalı İşlem Yapılamaz!"); }
}

public void durumYazdir() 
{
System.out.println("Durum = " + acik + ", Şimdiki Ses Seviyesi = " + simdikiSesSeviyesi + ", Şimdiki Frekans= " + simdikiFrekans);
}
}
