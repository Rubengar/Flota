
/**
 * Write a description of class VehiculoPequeño here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  abstract class VehiculoPeque extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int numPlazas;

    /**
     * Constructor for objects of class VehiculoPequeño
     */
    public VehiculoPeque(Marcas marca,int antiguedad, int kilometros, int numPlazas)
    {
        // initialise instance variables
        super(marca,antiguedad,kilometros);
        this.numPlazas = numPlazas;
    }
    
    public int getNumPlazas()
    {
        return numPlazas;
    }
    public abstract boolean cumpleMedidas();
    public abstract int[] getDatos();
}
