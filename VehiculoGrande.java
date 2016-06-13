
/**
 * Write a description of class VehiculoGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VehiculoGrande extends Vehiculo
{
    // instance variables - replace the example below with your own
    private int peso;

    /**
     * Constructor for objects of class VehiculoGrande
     */
    public VehiculoGrande(Marcas marca,int antiguedad, int kilometros,int peso)
    {
        super(marca,antiguedad,kilometros);
        this.peso = peso;
    }
}
