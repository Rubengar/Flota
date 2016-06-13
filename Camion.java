
/**
 * Write a description of class Camiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoGrande 
{
    // instance variables - replace the example below with your own
   
    public Camion(Marcas marca,int antiguedad, int kilometros,int peso)
    {
        super(marca,antiguedad,kilometros,peso);
    }
    
    public boolean esArticulado()
    {
        boolean esArticulado = false;
        if(getMarca()== Marcas.FORD.getMarca()||getMarca()== Marcas.FIAT.getMarca())
        {
            esArticulado = true;
        }
        return esArticulado;
    }
    @Override
    public boolean cumpleMedidas()
    {
        boolean cumple = false;
        if(esArticulado() &&  getPeso() < 3000)
        {
            cumple = true;
        }
        if(!esArticulado() &&  getPeso() < 2000)
        {
            cumple = true;
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
        array[3] = getPeso();
        return array;
    }
}
