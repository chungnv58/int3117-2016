package App1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class SinhVien{
    public static void main(String [] args){
        SinhVien sv = new SinhVien();
        sv.testGetten();
    }
    
    public String ten;
    public String masv;
    public String getten(){
        return this.ten;
    }
    public void setten(String ten){
        this.ten=ten;
    }
    public String getmasv(){
        return this.masv;
    }
    public void setmasv(String ma){
        this.masv=ma;
    }
    
    
    
}
