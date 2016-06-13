
/**
 * Enumeration class Marcas - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Marcas
{
    FORD("Ford"), 
    OPEL("Opel"), 
    CITROEN("Citroen"), 
    FIAT("Fiat");
    
    private String marca;
    
    Marcas(String marca)
    {
        this.marca= marca;
    }
    public String getMarca()
    {
        return marca;
    }
    
}
