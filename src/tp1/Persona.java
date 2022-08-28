package tp1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String sexo;
    private double peso;
    private double altura;
    private static final double MAX_IMC=25;
    private static final double MIN_IMC=18.5;
    private static final int MAYOR_EDAD =18;
    private static final int EDAD_VOTAR=16;

    public Persona(int dni) {
        this.dni = dni;
        nombre = "N";
        apellido = "N";
        fechaNacimiento = LocalDate.of(2000,1,1);
        sexo = "Femenino";
        peso = 1.00;
        altura = 1.00;
    }

    public Persona(int dni, String nombre, String apellido) {
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this(dni, nombre, apellido);
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento, String sexo) {
        this(dni, nombre, apellido, fechaNacimiento);
        this.sexo = sexo;
    }

    public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento, String sexo, double peso, double altura) {
        this(dni, nombre, apellido, fechaNacimiento, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIMC(){
        return getPeso()/(getAltura()*getAltura());
    }

    public boolean enForma(){
        return getIMC()<MAX_IMC&&getIMC()>MIN_IMC;
    }

    public boolean esCumpleanos(){
        return getFechaNacimiento().getMonth().equals(LocalDate.now().getMonth())
                &&(getFechaNacimiento().getDayOfMonth()==LocalDate.now().getDayOfMonth());
    }

    public boolean esMayorEdad(){
        return Period.between(getFechaNacimiento(),LocalDate.now()).getYears() >= MAYOR_EDAD;
    }

    public boolean puedeVotar(){
        return Period.between(getFechaNacimiento(),LocalDate.now()).getYears() >= EDAD_VOTAR;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + Period.between(getFechaNacimiento(),LocalDate.now()).getYears() +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
