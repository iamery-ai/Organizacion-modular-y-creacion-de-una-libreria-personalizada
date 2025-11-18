package model;

public class Centro {
    private String centroCultivo;
    private String tour;
    private String producto;
    private int cantidad;

    //Inicializar el Constructor
    public Centro(String centroCultivo, String tour, String producto, int cantidad){
        try{
            if (centroCultivo == null || tour == null || producto == null || cantidad < 0){
                throw new IllegalArgumentException("Los valores no pueden ser nulos o negativos");
            }
            this.centroCultivo = centroCultivo;
            this.tour = tour;
            this.producto = producto;
            this.cantidad = cantidad;
        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    //Getters y Setters
    public String getCentroCultivo() {
        return centroCultivo;
    }

    public void setCentroCultivo(String centroCultivo) {
        try{
            if (centroCultivo == null){
                throw new IllegalArgumentException("El centro de cultivo no puede ser nulo");
            }
            this.centroCultivo = centroCultivo;
        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        try{
            if(tour == null){
                throw new IllegalArgumentException("El tour no puede ser nulo");
            }
            this.tour = tour;
        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        try{
            if(producto == null){
                throw new IllegalArgumentException("El producto no puede ser nulo");
            }
            this.producto = producto;
        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        try{
            if(cantidad < 0){
                throw new IllegalArgumentException("La cantidad no puede ser negativa");
            }
            this.cantidad = cantidad;
        }catch (IllegalArgumentException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    //Metodo toString para ver reprecentacion del archivo
    @Override
    public String toString() {
        try{
            return "Centro:" + centroCultivo + ", Tour:" + tour + ", Producto:" + producto + ", Cantidad:" + cantidad;
        }catch (Exception e){
            return "Error: " + e.getMessage();
        }
    }
}
