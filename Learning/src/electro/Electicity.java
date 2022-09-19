package electro;
import java.text.DecimalFormat;

public class Electicity {
    private float newt1;
    private float newt2;
    private float oldt1;
    private float oldt2;
    private float t1coef;
    private  float t2coef;
    private float allelectr;

    public Electicity(float newt1, float newt2,float oldt1,float oldt2, float t1coef, float t2coef){
        this.newt1 = newt1;
        this.newt2 = newt2;
        this.oldt1 = oldt1;
        this.oldt2 = oldt2;
        this.t1coef = t1coef;
        this.t2coef = t2coef;
        this.allelectr = 0;
    }

    private String allElectricity(){
        float allelectr = ((newt1-oldt1)*t1coef)+((newt2-oldt2)*t2coef);
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(allelectr);
        return  formatted;
    }
    public String getElecticity(){
        return allElectricity();
    }
}
