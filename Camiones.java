
/**
 * Write a description of class Camiones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camiones extends VehiculoGrande implements Revision
{
    // instance variables - replace the example below with your own
   
    public Camiones(Marcas marca,int antiguedad, int kilometros,int peso)
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
}
