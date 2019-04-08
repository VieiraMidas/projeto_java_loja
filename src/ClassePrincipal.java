
import java.util.Scanner;

public class ClassePrincipal {
    
    public static void main (String[] args) {
    
        Carro carro1 = new Carro ();
        
        /* Para analisar algo digitado*/
        Scanner scan = new Scanner(System.in);
        
        /* Se caso deseja escrever na mesma linha que estiver a informação, basta retirar o "ln" */
        System.out.println ("Digite o nome do primeiro carro: ");
        /* Para receber uma informação já digitada*/
        carro1.nome = scan.next();
        System.out.println ("Digite a marca do primeiro carro: ");
        carro1.marca = scan.next ();
        System.out.println ("Digite a cor do primeiro carro: ");
        carro1.cor = scan.next ();
        System.out.println("Digite o peso do primeiro carro: ");
        carro1.peso = scan.next ();
        System.out.println ("Digite a largura do primeiro carro: ");
        carro1.largura = scan.next ();
        System.out.println ("Digite o ano de fabricação do primeiro carro: ");
        carro1.fabricacao = scan.next ();
        
        System.out.println ("Nome do primeiro carro: " + carro1.nome);
        System.out.println ("Marca do primeiro carro: " + carro1.marca);
        System.out.println ("Cor do primeiro carro: " + carro1.cor);
        System.out.println ("Peso do primeiro carro: " + carro1.peso);
        System.out.println ("Largura do primeiro carro: " + carro1.largura);
        System.out.println ("Fabricação do primeiro carro: " + carro1.fabricacao);
        
        /*--*/
        Carro carro2 = new Carro ();
        
        System.out.println ("Digite o nome do segundo carro: ");
        carro2.nome = scan.next();
        System.out.println ("Digite a marca do segundo carro: ");
        carro2.marca = scan.next ();
        System.out.println ("Digite a cor do segundo carro: ");
        carro2.cor = scan.next ();
        System.out.println("Digite o peso do segundo carro: ");
        carro2.peso = scan.next ();
        System.out.println ("Digite a largura do segundo carro: ");
        carro2.largura = scan.next ();
        System.out.println ("Digite o ano de fabricação do segundo carro: ");
        carro2.fabricacao = scan.next ();
        
        System.out.println ("Nome do segundo carro: " + carro2.nome);
        System.out.println ("Marca do segundo carro: " + carro2.marca);
        System.out.println ("Cor do segundo carro: " + carro2.cor);
        System.out.println ("Peso do segundo carro: " + carro2.peso);
        System.out.println ("Largura do segundo carro: " + carro2.largura);
        System.out.println ("Fabricação do segundo carro: " + carro2.fabricacao);
        
        /*---*/
        Carro carro3 = new Carro ();
        
        System.out.println ("Digite o nome do terceiro carro: ");
        carro3.nome = scan.next();
        System.out.println ("Digite a marca do terceiro carro: ");
        carro3.marca = scan.next ();
        System.out.println ("Digite a cor do terceiro carro: ");
        carro3.cor = scan.next ();
        System.out.println("Digite o peso do terceiro carro: ");
        carro3.peso = scan.next ();
        System.out.println ("Digite a largura do terceiro carro: ");
        carro3.largura = scan.next ();
        System.out.println ("Digite o ano de fabricação do terceiro carro: ");
        carro3.fabricacao = scan.next ();
        
        System.out.println ("Nome do terceiro carro: " + carro3.nome);
        System.out.println ("Marca do terceiro carro: " + carro3.marca);
        System.out.println ("Cor do terceiro carro: " + carro3.cor);
        System.out.println ("Peso do terceiro carro: " + carro3.peso);
        System.out.println ("Largura do terceiro carro: " + carro3.largura);
        System.out.println ("Fabricação do terceiro carro: " + carro3.fabricacao);
    }
}
