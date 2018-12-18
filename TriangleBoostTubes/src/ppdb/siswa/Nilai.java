/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb.siswa;

/**
 *
 * @author Dhandy
 */
public class Nilai {
    float mtk, bindo, bing, ipa, rataRata;

    public Nilai(float mtk, float bindo, float bing, float ipa, float rataRata) {
        this.mtk = mtk;
        this.bindo = bindo;
        this.bing = bing;
        this.ipa = ipa;
        this.rataRata = rataRata;
    }

    public float getMtk() {
        return mtk;
    }

    public float getBindo() {
        return bindo;
    }

    public float getBing() {
        return bing;
    }

    public float getIpa() {
        return ipa;
    }

    public float getRataRata() {
        return rataRata;
    }
    
    
}
