package ma.enset.filtrage.adapter;


import ma.enset.filtrage.IFiltrage;

public class FiltrageImpl3 implements IFiltrage {

    private ImplNonStandard implNonStandard = new ImplNonStandard();

    @Override
    public int[] filtrer(int[] data) {
        return implNonStandard.appliquerFiltre("FiltrageImpl3",data);
    }
}
