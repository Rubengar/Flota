
/**
 * Write a description of class FurgonetaGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends VehiculoGrande
{
    // instance variables - replace the example below with your own


    public FurgonetaGrande(Marcas marca,int antiguedad, int kilometros,int peso)
    {
        super(marca,antiguedad,kilometros,peso);
    }
    @Override
    public boolean cumpleMedidas()
    {
        return true;
    }
    @Override
    public int[] getDatos()
    {
        int[] array = new int[5];
        array[0] = getId();
        array[1] = getAntiguedad();
        array[2] = getKilometros();
        array[3] = getPeso();
        return array;
    }
}
