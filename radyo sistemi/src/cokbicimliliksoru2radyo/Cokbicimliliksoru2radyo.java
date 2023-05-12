/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cokbicimliliksoru2radyo;

/**
 *
 * @author MONSTER
 */
public class Cokbicimliliksoru2radyo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radyo sony = new Radyo();
sony.acKapat(); sony.sesArtir(40); sony.frekansDegis(98.0); sony.sesAzalt(20);
sony.durumYazdir();
Radyo philips = new Radyo(true, 55, 88.0);
philips.sesAzalt(10); philips.frekansDegis(87.0); philips.sesArtir(5); philips.durumYazdir();
CdCalarliRadyo sonyCdCalar = new CdCalarliRadyo();
sonyCdCalar.acKapat(); sonyCdCalar.sesArtir(40); sonyCdCalar.sarkiDegistir(9);
sonyCdCalar.durumYazdir();
CdCalarliRadyo philipsCdCalar = new CdCalarliRadyo(true, 55, 88.0, true, 8);
philipsCdCalar.sesAzalt(10); philipsCdCalar.sarkiDegistir(6); philipsCdCalar.durumYazdir();
    }
    
}
