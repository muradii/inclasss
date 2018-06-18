package clase6;
import java.util.Scanner;
public class Circulo {
    double radio;
    double perimetro;
    double area;
   
    public Circulo (double radio){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Radius:");
        radio = scanner.nextDouble();
        this.radio = radio;
    }
    
    public double getPerimetro (){
        perimetro = 2 * Math.PI * radio;
        return perimetro;   
    }
    
    public double getArea(){
        area = Math.PI * (radio * Math.pow(radio, 2));
        return area;
    }
    
}
