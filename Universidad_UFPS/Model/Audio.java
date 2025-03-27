public class Audio {
    private String grabacion;
    private String ubicacion;

    public Audio(String grabacion, String ubicacion) {
        this.grabacion = grabacion;
        this.ubicacion = ubicacion;
    }

    public String getGrabacion() { return grabacion; }
    public void setGrabacion(String grabacion) { this.grabacion = grabacion; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
}