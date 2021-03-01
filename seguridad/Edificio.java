package clasesyobjetos.seguridad;

import java.util.ArrayList;

public class Edificio {
    String direccion;
    int codigoPostal;
    ArrayList<String>alarmas=new ArrayList<>();

    public Edificio(String direccion, int codigoPostal) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

}
