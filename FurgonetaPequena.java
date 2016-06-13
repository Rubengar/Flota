
/**
 * Write a description of class FurgonetaPequeña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends VehiculoPeque 
{
    // instance variables - replace the example below with your own
    private int x;

     /**
     * Constructor for objects of class Coche
     */
    public FurgonetaPequena(Marcas marca,int antiguedad, int kilometros, int numPlazas)
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
    @Override
    public int[] getDatos()
    {
        int[] array = new int[5];
        array[0] = getId();
        array[1] = getAntiguedad();
        array[2] = getKilometros();
        array[3] = getNumPlazas();
        return array;
    }
}
