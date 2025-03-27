import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private Date fechaNacimiento;
    private String tipo;
    private String estatus;
    private String rol;

    public Usuario(String nombre, String apellido, String email, Date fechaNacimiento, String tipo, String estatus, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
        this.estatus = estatus;
        this.rol = rol;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public String getEstatus() { return estatus; }
    public void setEstatus(String estatus) { this.estatus = estatus; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}