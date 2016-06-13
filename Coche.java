
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPeque
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marcas marca,int antiguedad, int kilometros, int numPlazas)
    {
        super(marca,antiguedad,kilometros,numPlazas);
    }
    
    public int revisionCada()
    {
        int num = 1;
        if(getMarca()== Marcas.FORD.getMarca())
        {
            num = 2;
        }
        return num;
    }
    @Override
    public boolean cumpleMedidas()
    {
        boolean cumple = false;
        if(getNumPlazas() <= 5)
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
        array[4] = revisionCada();
        return array;
    }
}
