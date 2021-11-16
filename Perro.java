
public class Perro extends Animales{
    private String name;
    private Float weight;
    private String habitat;
    private Boolean danger;
    
    //constructores

    public Perro(){};

    public Perro(String name, Float weight, String habitat, Boolean danger){
        
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
        this.danger = danger;
    }
    
    //gettes y setters
    
    public String getName(){
        return this.name;
    }

    public String setName(){
        return this.name;
    }
    public Float getWeight(){
        return this.weight;
    }

    public Float setWeight(){
        return this.weight;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public String setHabitat(){
        return this.habitat;
    }

    public Boolean getDanger(){
        return this.danger;
    }

    public Boolean setDanger(){
        return this.danger;
    }

    //metodos 

    public String comunicarse(){
        return "Ladrar";
    }

    public String trasladarse(){
        return "caminando";
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getName() + "'" +
            ", peso='" + getWeight() + "'" +
            ", habitat='" + getHabitat() + "'" +
            ", peligro='" + getDanger() + "'" +
            "}";
    }
}





        // // declaración de switch
        // switch () {
        
        
        //     case valor1:
        //         // Declaraciones
        //         break; 

        //     case valor2:
        //         // Declaraciones
        //         break; 

            
            
            
        
        //     default:
        //         // Declaraciones
        // }

        // System.out.println("Ingrese el nombre del Animal: "); // pido al usuario ingresar los datos
        // name = scan.nextLine(); // guardo lo ingresado por el usuario en la variable declarada
        // System.out.println("El nombre ingresado es " + name); // muestro lo que ingresó el usuario

        // System.out.println("Ingrese el peso del Animal: ");
        // weight = scan.nextFloat();
        // System.out.println("El peso ingresado es " + weight);

        // System.out.println("¿Dónde habita este animal? ");
        // habitat = scan.nextLine();
        // System.out.println("El habitat ingresado es " + habitat);
