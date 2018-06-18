package clase6;
import java.util.Scanner;
public class Cuadrado {
    private double lado;
    private double perimetro;
    private double area;
    
    public Cuadrado (double lado){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Lado:");
        lado = scanner.nextDouble();
        this.lado = lado;
    }
    
    public double getPermimetro(){
        
        perimetro = lado * 4;
        return perimetro;
    }
    
    public double getArea(){
        area = Math.pow(lado, 3);
        return area;
    }
    
}
