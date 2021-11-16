import java.util.InputMismatchException;
import java.util.Scanner; //para poder usar el scanner





public class MainClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // declaro variables necesarias
        String name;
        Float weight;
        String habitat;
        Boolean danger; 
        
        
        
        Integer opcion;
        System.out.println("Por favor, ingrese una opción para instanciar un animal: \n 1 - Gato \n 2 - Perro \n 3 - Pez \n 4 - Canario \n 5 - Vaca \n 6 - Mono ");
        opcion = scan.nextInt();



        // declaración de switch
        switch (opcion) {
            
            case 1:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();

                Gato gato = new Gato(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + gato.getName() + "\n Peso: " + gato.getWeight() + "\n Habitat: " + gato.getHabitat() + "\n En peligro de extinsión: " + gato.getDanger());
            
            }catch(InputMismatchException e){
               System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }

                break; 

            case 2:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();
        

                Perro perro = new Perro(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + perro.getName() + "\n Peso: " + perro.getWeight() + "\n Habitat: " + perro.getHabitat() + "\n En peligro de extinsión: " + perro.getDanger());
            
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }
                
                break; 
            
            case 3:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();
        

                Pez pez = new Pez(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + pez.getName() + "\n Peso: " + pez.getWeight() + "\n Habitat: " + pez.getHabitat() + "\n En peligro de extinsión: " + pez.getDanger());
            
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }
                
                break; 

            case 4:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();
        

                Canario canario = new Canario(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + canario.getName() + "\n Peso: " + canario.getWeight() + "\n Habitat: " + canario.getHabitat() + "\n En peligro de extinsión: " + canario.getDanger());
            
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }
                
                break; 
            
            case 5:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();

                Vaca vaca = new Vaca(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + vaca.getName() + "\n Peso: " + vaca.getWeight() + "\n Habitat: " + vaca.getHabitat() + "\n En peligro de extinsión: " + vaca.getDanger());
            
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }
                
                break; 
            
            case 6:
            
            try{
                System.out.println("Ingrese el nombre del animal: ");
                name = scan.next();

                System.out.println("Ingrese el peso del animal: ");
                weight = scan.nextFloat();

                System.out.println("Ingrese el habitat del animal: ");
                habitat = scan.next();

                System.out.println("¿Este animal está en peligro de extinsión? Ingrese TRUE o FALSE");
                danger = scan.nextBoolean();
        

                Mono mono = new Mono(name, weight, habitat, danger);
                System.out.println("Se declaró el siguiente animal: \n Nombre: " + mono.getName() + "\n Peso: " + mono.getWeight() + "\n Habitat: " + mono.getHabitat() + "\n En peligro de extinsión: " + mono.getDanger());
            
            }catch(InputMismatchException e){
                System.out.println("Error: "+e.getMessage());
            
            }finally{
                System.out.println("Programa finalizado.");
            }
                
                break; 

            default:
                System.out.println("La opción ingresada es incorrecta. Por favor, ingrese un número del 1 al 6.");
        }
    
        

        

        scan.close();

    }
}