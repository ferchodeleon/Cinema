
package cinema;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class cimena {

    //Cola cola = new Cola();
    
    public static void main(String[] args) {
        
        Cola cola = new Cola();
        Scanner Lector = new Scanner(System.in);
        int dato = 0;
        int seleccion=0;
        int descuento = 0;
        int devolucion = 0;
        
        int entrada_general=0;
        int total_general=0;
        int total_cancelacion_general=0;
        int devolucion_general=0;
        int conteo_general=0;
        int conteo_canceladas_general=0;
        
        int entrada_vip=0;
        int total_vip=0;
        int total_cancelacion_vip=0;
        int devolucion_vip=0;
        int conteo_vip=0;
        int conteo_canceladas_vip=0;
        
        int entrada_palco=0;
        int total_palco=0;
        int total_cancelacion_palco=0;
        int devolucion_palco=0;
        int conteo_palco=0;
        int conteo_canceladas_palco=0;
        
        
        do{
           // Menú selección general
            System.out.println(":: CIMENA SPOYLER ::");
            System.out.println("1. Vender entradas");
            System.out.println("2. Eliminar usuarios de las localidades");
            System.out.println("3. Informes");
            System.out.println(" ::    0 EXIT  :: ");
            seleccion = Lector.nextInt();
            
            switch(seleccion){
                
                case 1:
            // PARTE DE LA VENTA        
                    System.out.println("1. Vender GENERAL");
                    System.out.println("2. Vender V.I.P");
                    System.out.println("3. Vender PALCO");
                        switch(seleccion)
                        {
                            case 1:
                                if (cola.tamanio_general()<19)
                                {
                                    System.out.println("Ingrese número de documento");
                                    dato = Lector.nextInt();
                                    cola.adicionar_general(dato);
                                    conteo_general ++ ;
                                    total_general = total_general + 50000;
                                    entrada_general = entrada_general + 50000;
                                }else
                                {
                                    System.out.println("No se encuentran entradas generales disponibles");
                                }
                            break;
                            
                            case 2:
                                if (cola.tamanio_vip()<9)
                                {
                                    System.out.println("Ingrese número de documento");
                                    dato = Lector.nextInt();
                                    cola.adicionar_vip(dato);
                                    conteo_vip ++ ;
                                    total_vip = total_vip + 250000;
                                    entrada_vip = entrada_vip + 250000;
                                }else
                                {
                                    System.out.println("No se encuentran entradas generales disponibles");
                                }
                            break;
                            
                            case 3:
                                if (cola.tamanio_palco()<4)
                                {
                                    System.out.println("Ingrese número de documento");
                                    dato = Lector.nextInt();
                                    cola.adicionar_palco(dato);
                                    conteo_palco ++;
                                    total_palco = total_palco + 150000;
                                    entrada_palco = entrada_palco + 150000;
                                }else
                                {
                                    System.out.println("No se encuentran entradas generales disponibles");
                                }
                            break;
                        }
                    // FIN PARTE DE LA VENTA
                break;
                
        // INICIO PARTE ELIMINAR USUARIOS        
                case 2:
                    
                    System.out.println("Seleccione la entrada de la que quiere eliminar");
                    System.out.println(" 1. GENERAL");
                    System.out.println(" 2. V.I.P");
                    System.out.println(" 3. PALCO");
                    seleccion = Lector.nextInt();
                    switch(seleccion)
                    {
                        
                        case 1:
                            if( cola.tamanio_general() < 0 )
                            {
                                System.out.println("Se elimino el cliente: " + cola.eliminar_general());
                                descuento = (int) (50000 * 0.2);
                                devolucion = (int) (50000 * 0.8);
                                total_general = total_general - 50000;
                                total_cancelacion_general = total_cancelacion_general + devolucion;
                                devolucion_general = devolucion_general + descuento;
                                System.out.println("Valor de devolución: $" + devolucion +"\n");
                                conteo_general --;
                                conteo_canceladas_general ++;
                                descuento = 0;
                                devolucion = 0; 
                            }else
                            {
                                System.out.println("    ¡¡¡¡Aún no se han vendido entradas de tipo GENERAL!!!!\n");
                            }
                        break;
                        
                        case 2:
                            if ( cola.tamanio_vip() < 0 )
                            {
                                System.out.println("Se elimino el cliente: " + cola.eliminar_vip());
                                descuento = (int) (50000 * 0.2);
                                devolucion = (int) (50000 * 0.8);
                                total_vip = total_vip - 250000;
                                total_cancelacion_vip = total_cancelacion_vip + devolucion;
                                devolucion_vip = devolucion_vip + descuento;
                                System.out.println("Valor de devolución: $" + total_vip +"\n");
                                conteo_vip --;
                                conteo_canceladas_vip ++;
                                descuento = 0;
                                devolucion = 0;
                            } else
                            {
                                System.out.println("    ¡¡¡¡Aún no se han vendido entradas de tipo VIP!!!!\n");
                            } 
                            
                        break;
                        
                        case 3:
                            if( cola.tamanio_palco() < 0 )
                            {
                                System.out.println("Se elimino el cliente: " + cola.eliminar_palco());
                                descuento = (int) (50000 * 0.2);
                                devolucion = (int) (50000 * 0.8);
                                total_palco = total_palco - 250000;
                                total_cancelacion_palco = total_cancelacion_palco + devolucion;
                                devolucion_palco = devolucion_palco + descuento;
                                System.out.println("Valor de devolución: $" + total_palco +"\n");
                                conteo_palco --;
                                conteo_canceladas_palco ++;
                                descuento = 0;
                                devolucion = 0;
                            } else
                            {
                                System.out.println("    !!!!Aún no se han vendido entradas de tipo PALCO!!!!\n");
                            }
                            
                        break;
                    }
                    
                break;
                
        // FIN PARTE ELIMINAR USUARIOS        
                
        // INICIO PARTE DE INFORMES        
                case 3:
                    
                    System.out.println("1. Número de personas que ingresaron por localidad");
                    System.out.println("2. Número de personas que cancelaron por localidad");
                    System.out.println("3. Total de ingreso de dinero por localidad");
                    System.out.println("4. Total de dinero devuelto por cancelaciones");
                    System.out.println("5. Total del dinero ingresado por cancelaciones (parte administrativa)");
                    seleccion = Lector.nextInt();
                    
                        switch(seleccion)
                        {
                    // INICIO INFORME DE INGRESADOS POR LOCALIDAD        
                            case 1:
                                System.out.println("        1. Informe de localidad GENERAL");
                                System.out.println("          ingresaron: " + conteo_general);
                                System.out.println("        1. Informe de localidad V.I.P");
                                System.out.println("          ingresaron: " + conteo_vip);
                                System.out.println("        1. Informe de localidad PALCO");
                                System.out.println("          ingresaron: " + conteo_palco);
                            break;
                    // FIN INFORME DE INGRESADOS POR LOCALIDAD        

                    // INICIO INFORME DE CANCELACIONES POR LOCALIDAD      
                            case 2:
                                System.out.println("        1. Informe de localidad GENERAL");
                                System.out.println("          cancelaron: " + conteo_canceladas_general);
                                System.out.println("        1. Informe de localidad V.I.P");
                                System.out.println("          cancelaron: " + conteo_canceladas_vip);
                                System.out.println("        1. Informe de localidad PALCO");
                                System.out.println("          cancelaron: " + conteo_canceladas_palco);
                            break;
                    // FIN INFORME DE CANCELACIONES POR LOCALIDAD

                    // INICIO INFORME DE DINERO INGRESADO POR LOCALIDAD
                            case 3:
                                System.out.println("        El ingreso total por localidad es:");
                                System.out.println("        Localidad GENERAL: " +  total_general);
                                System.out.println("        Localidad V.I.P: " +  total_vip);
                                System.out.println("        Localidad PALCO: " +  total_palco);
                            break;
                    // FIN INFORME DE DINERO INGRESADO POR LOCALIDAD

                    // INICIO INFORME DEVOLUCION DINERO POR LOCALIDAD
                            case 4:
                                System.out.println("        Total de devolución es: ");
                                System.out.println("        Localidad GENERAL: " + total_cancelacion_general);
                                System.out.println("        Localidad V.I.P: " + total_cancelacion_vip);
                                System.out.println("        Localidad PALCO: " + total_cancelacion_palco);
                            break;
                    // INICIO INFORME DEVOLUCION DINERO POR LOCALIDAD

                    // INICIO INGRESO DINERO ADMINISTRATIVA
                            case 5:
                                System.out.println("        Dinero de ingreso por administración es: ");
                                System.out.println("        Localidad GENERAL: " + devolucion_general);
                                System.out.println("        Localidad GENERAL: " + devolucion_vip);
                                System.out.println("        Localidad GENERAL: " + devolucion_palco);
                        }        
            }
        }while( seleccion != 0 );
    }
}
