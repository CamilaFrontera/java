import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import main.java.Pais;


public class Ejemplo {

	
	public static void main(String[] args) {
		List<Pais> paises = new ArrayList<Pais>();

		 paises.add(new Pais(0, "Argentina", 54));
		   paises.add(new Pais(1, "Bolivia", 591));
		   paises.add(new Pais(2, "Brasil", 55));
		   paises.add(new Pais(3, "Chile", 56));
		   paises.add(new Pais(4, "Colombia", 57));
		   paises.add(new Pais(5, "Ecuador", 593));
		   paises.add(new Pais(6, "España", 34));
		   paises.add(new Pais(7, "Mexico", 52));
		   paises.add(new Pais(8, "Panamá", 507));
		   paises.add(new Pais(9, "Paraguay", 595));
		   paises.add(new Pais(10, "Perú", 51));
		   paises.add(new Pais(11, "Uruguay", 598));
		   paises.add(new Pais(12, "Venezuela", 58));
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Por favor, ingrese el código de area por el que desea consultar: ");		   
		   
		   
		   try {
			   int codigo = scanner.nextInt();
               
			   
            
           	List<String> codigoPais = paises.stream()
						.filter(pais -> pais.getCodigoArea() == codigo)
						.map(Pais::getNombre)
						.collect(Collectors.toList());
           	 
           	
           	System.out.println("El pais que tiene (+"+codigo+") como codigo de area es :" + codigoPais);
				
			}catch (InputMismatchException e) {
				Message mensaje = new Message();
		        mensaje.logError("Debe Ingresar un número.");
				scanner.nextLine();
			}
			finally {
				Message mensaje = new Message();
				mensaje.logInfo("Ejecución finalizada");
				scanner.close();
			}
		   
		
	
        
		   
	}
}
