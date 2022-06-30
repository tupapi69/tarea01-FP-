package pe.edu.upeu.dao;

public class ProductoDao extends AppCrud{
    LeerTeclado LeerT=new LeerTeclado();
    LeerArchivo leerA;
    UtilsX util=new UtilsX();

    ProductoTO pTo;
    final static String TABLA_PRODUCTO="Producto.txt";
    final static String TABLA_CATEGORIA="Categoria.txt";
    final static String TABLA_MODELO="Modelo.txt";

    public void CrearProducto() {
    leerA=new LeerArchivo(TABLA_PRODUCTO);
    pTo=new ProductoTO();
    String idPro=generarId(leerA, 0, "P", 1);
    pTo.setIdProducto(idPro);
    pTo.setNombreProd(leerT.leer("", "Nombre Producto"));
    mostrarCategoria();
    pTo.setIdCat(leerT.leer("", "Seleccione una Categoria"));
    mostrarModelo();
    pTo.setIdMod(leerT.leer("", "Seleccione un modelo"));
    pTo.setPrecioUnid(leerT.leer(0.0, "ingrese el Precio Unitario"));
    pTo.setUtilidad(leerT.leer(0.0, "Ingrese la utilidad"));
    pTo.setUnidMed(leerT.leer("", "Unidad Medida"));
    pTo.setStock(leerT.leer(0, "Ingrese Cantidad"));
    pTo.setCantMayor(leerT.leer(0, "Ingrese cantidad para descuento"));
    LeerA=new LeerArchivo
    }

    public void MostrarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object[][]dataC=listarContenido(LeerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.print(dataC[i][0]+"="+dataC[i][1]+", ");
        }
        System.out.println("");
    }
    public void mostrarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object[][] dataC=listarContenido(leerA);
        for (int i = 0; i < dataC.length; i++) {
            System.out.print(dataC[i][0]+"="+dataC[i][1]+", ");
        }
   }

    }
}
