public class Prenda {
  TipoDePrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;
  public Prenda(TipoDePrenda tipo, MaterialPrenda material,Color colorPrincipal,Color colorSecundario){
        if(tipo == null || material == null ||colorPrincipal== null ){
            throw new ExcepcionPrendaInvalida("Faltan datos requeridos");
        }
    this.tipo=tipo;
    this.material=material;
    this.colorPrincipal=colorPrincipal;
    this.colorSecundario=colorSecuandario;
    }
}
enum Categoria {
  PARTE_SUPERIOR,
  CALZADO,
  PARTE_INFERIOR,
  ACCESORIOS
}

enum MaterialPrenda {
  ALGODON,
  LYCRA,
  PLASTICO,
  CUERO,
}
class Color{
  Integer red;
  Integer green;
  Integer blue;
}

class TipoDePrenda {
   Categoria categoria;
   public TipoDePrenda(Categoria categoria) {
     this.categoria = categoria;
   }
  public Categoria categoria() {
    return this.categoria;
   }
}



