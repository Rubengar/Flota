import java.util.*;
/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private ArrayList<Vehiculo> flota;
    private int[] marcas;
    private int[] datos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        flota = new ArrayList<>();
        marcas = new int[4];
        datos = new int[5];
    }

    public void addVehiculo(Vehiculo vehiculo)
    {
        flota.add(vehiculo);
        if( vehiculo.getMarca().equals("Ford") )
        {
            marcas[0]++;
        }
        else if( vehiculo.getMarca().equals("Opel") )
        {
            marcas[1]++;
        }
        else if( vehiculo.getMarca().equals("Citroen") )
        {
            marcas[2]++;
        }
        else
        {
            marcas[3]++;
        }
    }
    
    public void removeVehiculo(int id)
    {
        for(int a = 0; a < flota.size(); a++)
        {
            if (flota.get(a).getId() == id)
            {
                flota.remove(a);
            }
        }
    }
    
    public Marcas marcaMayoritaria()
    {
        Marcas marca = null;
        if (marcas[0] > marcas[1] && marcas[0] > marcas[2]&& marcas[0] > marcas[3])
        {
           marca = Marcas.FORD;
        }
        else if (marcas[1] > marcas[0] && marcas[1] > marcas[2]&& marcas[1] > marcas[3])
        {
            marca = Marcas.OPEL;
        }
        else if (marcas[2] > marcas[0] && marcas[2] > marcas[1]&& marcas[2] > marcas[3])
        {
            marca = Marcas.CITROEN;
        }
        else
        {
            marca = Marcas.FIAT;
        }
        return marca;
    }
    
    public boolean cumplenMedidas()
    {
        boolean cumplen = true;
        for (Vehiculo vehiculo: flota)
        {
            if( !vehiculo.cumpleMedidas())
            {
                cumplen = false;
            }
        } 
        return cumplen;
    }
    public int[] getDatos(int id)
    {
        int[] datos = new int[5];
        for(int a = 0; a < flota.size(); a++)
        {
            if (flota.get(a).getId() == id)
            {
                
                datos = flota.get(a).getDatos();
            }
        }
        return datos;
    }
}

