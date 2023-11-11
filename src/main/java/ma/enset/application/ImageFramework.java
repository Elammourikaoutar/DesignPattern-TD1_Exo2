package ma.enset.application;


import ma.enset.compression.templateMethod.Compresser;
import ma.enset.compression.templateMethod.DefaultCompressImpl;
import ma.enset.filtrage.IFiltrage;
import ma.enset.filtrage.strategy.DefaultFiltrageImpl;

public class ImageFramework {
        private IFiltrage filtre;
        private Compresser compresser;

        public ImageFramework() {
            filtre =  new DefaultFiltrageImpl();
            compresser = new DefaultCompressImpl();
        }

        public void setFiltre(IFiltrage filtre) {
            this.filtre = filtre;
        }

        public IFiltrage getFiltre() {
            return filtre;
        }

        public Compresser getCompress() {
            return compresser;
        }

        public void setCompress(Compresser compress) {
            this.compresser = compress;
        }
    }
