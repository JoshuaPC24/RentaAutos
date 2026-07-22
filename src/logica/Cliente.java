package logica;

import java.time.LocalDate;

/**
 *
 * @author hanna
 */
public class Cliente {

    private int cedula;
    private String nombre;
    private LocalDate fechaNac;
    private String genero;
    private int telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int cedula, String nombre, LocalDate fechaNac, String genero, int telefono, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        return "Cliente{"
                + "cedula=" + cedula
                + ", nombre='" + nombre + '\''
                + ", fechaNac=" + fechaNac
                + ", genero='" + genero + '\''
                + ", telefono=" + telefono
                + ", direccion='" + direccion + '\''
                + '}';

    }
}
