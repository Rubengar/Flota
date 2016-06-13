/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private String marca;
    
    private int antiguedad;
    
    private int kilometros;
    
    private static int id = 0;
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public Vehiculo(Marcas marca,int antiguedad, int kilometros)
    {
        this.marca = marca.getMarca();
        this.antiguedad = antiguedad;
        this.kilometros = kilometros;
        id++;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public int getId()
    {
        return id;
    }
    
    public int getAntiguedad()
    {
        return antiguedad;
    }
    
    public int getKilometros()
    {
        return antiguedad;
    }
    
    public abstract boolean cumpleMedidas();
    public abstract int[] getDatos();
}
