package temados.ejercicios;

public class Cuenta {
    public static void main(String[] args) {
        Cuenta maria = new Cuenta("María", 2000);
        maria.ingresar(50); // cantidad (objeto) + cantidad (parámetro)
        System.out.println(maria.getCantidad());
    }

    //1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

    String titular;
    double cantidad;

    //El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular,double cantidad){
        this.titular = titular;
        this.cantidad= cantidad;
    }


    //Crea sus métodos get, set y toString.

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
//Tendrá dos métodos especiales:
    //ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    void ingresar (double cantidad){
        this.cantidad += cantidad;
    }




    //retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
}
