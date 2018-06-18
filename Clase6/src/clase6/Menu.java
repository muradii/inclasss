
package clase6;
import java.util.Scanner;
public class Menu {
   
    int answer;
    int redirectAnswer;
    public int getAnswer(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("1. Perimetro 2. Area 3.Quit");
        answer = scanner.nextInt();
        return answer;
    }
    
    public int redirectAnswer (){
        Scanner scanner = new Scanner (System.in);
        System.out.println("1. Cuadrado 2. Rectangulo 3. Circulo");
        redirectAnswer = scanner.nextInt();
        return redirectAnswer;
    }
    
}
