
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPeque extends VehiculoPeque implements Revision
{
    // instance variables - replace the example below with your own
    private int x;

     /**
     * Constructor for objects of class Coche
     */
    public FurgonetaPeque(Marcas marca,int antiguedad, int kilometros, int numPlazas)
    {
        super(marca,antiguedad,kilometros,numPlazas);
    }
    @Override
    public boolean cumpleMedidas()
    {
        boolean cumple = false;
        if(getNumPlazas() <= 7)
        {
            cumple=true;
        }
        return cumple;
    }
}
