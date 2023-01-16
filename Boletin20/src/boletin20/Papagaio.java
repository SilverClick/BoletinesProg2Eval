
package boletin20;


public class Papagaio extends Aves implements IPodeCamiñar {

    @Override
    public void camiñar() {
        System.out.println(" El papagallo camina ");
    }
    public void voarr(){
        super.voar();
    }
}
