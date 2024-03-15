
public class BujurSangkar extends BangunDatar {
    
    public BujurSangkar(int s) {
        super(s);     
    }
    
    
    int getLunas(){
        int s = super.getSisi();
        return s * s;
        
        
    }
    int getKeliling(){
        int s = super.getSisi();
        return s + s + s + s;    
    }
}