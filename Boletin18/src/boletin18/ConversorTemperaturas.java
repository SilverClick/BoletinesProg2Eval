
package boletin18;


public class ConversorTemperaturas {
public final int GradosLimite= 80;  

public float centigradosAFharenheit(float temperaturaCentigrados)throws TemperaturaErradaExcepcion{
    if (temperaturaCentigrados<GradosLimite)
             throw new TemperaturaErradaExcepcion("** A temperatura non pode ser menor a 80 grados ** ");
    else{
    float temperaturaFharenheit= (float) (9.0 / 5.0 * temperaturaCentigrados + 32.4);
    System.out.println("O resultado é= "+temperaturaFharenheit+" graos Fharenheit");
    return temperaturaFharenheit;
    }
}
public void centigradosAReamur(float graosCentigrados) throws TemperaturaErradaExcepcion{
    if (graosCentigrados<GradosLimite)
             throw new TemperaturaErradaExcepcion("** A temperatura non pode ser menor a 80 grados ** ");
   float graosReamur = (float) (4.0 / 5.0 * graosCentigrados);
    System.out.println("O resultado é= "+graosReamur+" graos Reamur");
   
}
}
