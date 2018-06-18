package clase6;
import java.util.Scanner;
public class Rectangulo {
    double lado1;
    double lado2;
    double perimetro;
    double area;
    
    public Rectangulo ( double lado1, double lado2){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Lado 1:");
        lado1 = scanner.nextDouble();
        System.out.println("Lado 2:");
        lado2 = scanner.nextDouble();
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double getPerimetro(){
        perimetro = (2 * lado1) + (2 * lado2);
        return perimetro;
    }
    
    public double getArea (){
        area = lado1 * lado2;
        return area;
    }
}
