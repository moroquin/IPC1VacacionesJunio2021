package src.objetos.figuras_geometricas;

public class Cuadrado {
    private int lado; 

    public Cuadrado(){
        this(1);
    }

    public Cuadrado(int lado){
        this.lado = lado;
        //this.lado = lado;

    }

    public boolean setLado(int lado){
        if (lado > 0){

            this.lado = lado;
            return true;
        }

        return false;
    }

    public int getPerimetro(){
        return lado * 4;

    }

    public int getArea(){
        return lado * lado;
        
    }
    
}