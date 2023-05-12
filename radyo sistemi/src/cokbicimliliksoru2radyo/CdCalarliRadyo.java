
package cokbicimliliksoru2radyo;


public class CdCalarliRadyo  extends Radyo
{
    final static int enFazlaSarkiSayisi = 12;
final static int enAzSarkiSayisi = 1;
private int calinanSarki; 
private boolean cdAcik;

public CdCalarliRadyo() 
{ super();
cdAcik = false;
calinanSarki = 1;
}
public CdCalarliRadyo(boolean basDurumu, int basSesSeviyesi, double basFrekansi, boolean cdBasDurumu, int basCalinanSarki)
{
super(basDurumu, basSesSeviyesi, basFrekansi);
cdAcik = cdBasDurumu; 
calinanSarki= basCalinanSarki; 
}

@Override
public void acKapat()
{ cdAcik = (cdAcik == true) ? false : true; }

public void sarkiDegistir(int yeniSarki) 
{
if (cdAcik == true)
{
if((enAzSarkiSayisi <= yeniSarki) && (yeniSarki <= enFazlaSarkiSayisi))
calinanSarki = yeniSarki;
}

@Override
        
  void durumYazdir() 
{
       System.out.println("CD Durum = " + cdAcik + ", Çalınan Şarkının Sırası = " + calinanSarki + ", Şimdiki Ses Seviyesi = " );
}
    
}
 