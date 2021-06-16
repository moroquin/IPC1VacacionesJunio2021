package src.objetos.contadores;

public class contador {

    private int cont; 

    //constructores
    //contador()
    public contador(){
        //cont = 0;
        this(0);
    }

    // contador(int, String)
    public contador(int cuenta){
        cont = cuenta;
    }
    
    //fin de constructores


    //getters setters 
    public int getCont(){
        return cont;
    }

    public boolean setCont(int cont){
        if (cont>0){
            this.cont = cont;
            return true;
        }
        return false;
    }
    //fin getters setters 


    //métodos

    public void incrementar(){
        cont++;
    }

    public void decrementar(){
        if(cont>0)
            cont--;
    }

    public String imprimirDatos(){
        return "Contador: "+cont;
    }


    //fin de métodos

    
}
