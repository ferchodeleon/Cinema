
package cinema;

//import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    
    Queue general = new LinkedList();
    Queue vip = new LinkedList();
    Queue palco = new LinkedList();
    
    public void adicionar_general(int a){
        general.add(a);
    }
    
    public int tamanio_general(){
        
        return (int) general.size();
    }
    
    public int eliminar_general() {
        return(int) general.remove();
    }
    
    public void adicionar_vip(int a){
        vip.add(a);
    }
    
    public int tamanio_vip(){
        
        return (int) vip.size();
    }
    
    public int eliminar_vip() {
        return(int) general.remove();
    }
    
    public void adicionar_palco(int a){
        palco.add(a);
    }
    
    public int tamanio_palco(){
        
        return (int) palco.size();
    }
    
    public int eliminar_palco() {
        return(int) general.remove();
    }
    
    public void mostrar() {
        System.out.println(general);
    }
    
    public int tamanio(){
        
        return (int) general.size();
    }
    
    
}
