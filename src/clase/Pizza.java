
package clase;

import clase.Tipo;

/**
 *
 * @author susana 
 */
public class Pizza {

        private Tipo tipo ;
        private String tamaño;
        private static int totalPedidas;
        private static int totalServidas;
        /* estado: false=pedida y true =servida*/
        private boolean estado;
        
        public Pizza(){
            this.estado= false;
            this.tipo= Tipo.MARGARITA;
            this.tamaño= "mediana";
            totalPedidas+=1;
        }
        public Pizza (Tipo tipo,String tamaño){
           this.estado= false;
            this.tipo= tipo;
            this.tamaño= tamaño;
            totalPedidas+=1; 
            
        }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadoString = "";
        if(estado){
            estadoString = "servida";
            
        }else{
            estadoString = "pedida";
        }
        return( "Pizza" + " " + tipo + " " + tamaño + ", " + estadoString);
    }
        
    public void sirve(){
        
    }
        
       
            
    
    
}
