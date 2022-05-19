import java.util.List;

import static java.util.Objects.requireNonNull;

public class Prenda {
  TipoDePrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama;

  public Prenda(TipoDePrenda tipo, MaterialPrenda material,Color colorPrincipal,Color colorSecundario){
     /*   if(tipo == null || material == null ||colorPrincipal== null ){
            throw new ExcepcionPrendaInvalida("Faltan datos requeridos");
        }*/
    this.tipo=tipo;
    this.material=material;
    this.colorPrincipal=colorPrincipal;
    this.colorSecundario=colorSecundario;
    }
}
//quito las validaciones de la prenda xq las voy a validar en el build (borrador) de la iteracion 2
class Categoria {
  TipoCategoria tipoCategoria;
  public Categoria (TipoCategoria tipoCategoria) {
    this.tipoCategoria = tipoCategoria;
  }
}
enum TipoCategoria {
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
//-------------------------------- ITERACION 2-----------------
//Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).
enum Trama{
  LISA, RAYADA, LUNARES, CUADROS, ESTAMPADO,
}

class Borrador {
  TipoDePrenda tipo;
  MaterialPrenda material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama= Trama.LISA; //quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa.

  //de esta manera creo la prenda en pasos
  public void especificarTipo(TipoDePrenda tipo){
    requireNonNull(tipo);
    this.tipo=tipo;
  }
  public void especificarMaterial(MaterialPrenda material){
    requireNonNull(material);
    this.material=material;
  }
  public void especificarColorPrincipal(Color colorPrincipal){
    requireNonNull(colorPrincipal);
    this.colorPrincipal=colorPrincipal;
  }
  public void especificarColorSecundario(Color colorSecundario){
    requireNonNull(colorSecundario);
    this.colorSecundario=colorSecundario;
  }
  public void especificarTrama(Trama trama){
    this.trama=trama;
  }
  public Prenda crearPrenda() {
    return new Prenda(tipo, material, colorPrincipal, colorSecundario,trama);
  }
  //requireNonNull para el fail fast

}
--------------------------------------------------------------------------------------------------
Iteracion 4
