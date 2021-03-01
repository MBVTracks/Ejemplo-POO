package clasesyobjetos.seguridad;
import java.util.*;
import java.util.ArrayList;

public class Central {
    String ciudad;
    List<Integer>edificios=new ArrayList<>();

    public Central(String ciudad, List<Integer> edificios) {
        this.ciudad = ciudad;
        this.edificios = edificios;
    }

    public void añadirEdificio(Integer edificios){

    }
    public void quitarEdificio(Integer edificio){

    }
    public void mostarEdificios(){

    }

    @Override
    public String toString() {
        return "Central{" +
                "ciudad='" + ciudad + '\'' +
                ", edificios=" + edificios +
                '}';
    }
}
