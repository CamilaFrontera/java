public class Gato extends Animales{
    private String name;
    private Float weight;
    private String habitat;
    private Boolean danger;
    
    //constructores
    public Gato(){};

    public Gato(String name, Float weight, String habitat, Boolean danger){
        
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
        this.danger = danger;
    }
    
    //getters y setters 

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
        return "Maullar";
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