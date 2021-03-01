package clasesyobjetos.seguridad;
import java.util.*;
import java.util.ArrayList;

public class Alarma {
    TipoAlerta alerta;
    List<Integer>sensor=new ArrayList<>();

    public Alarma(TipoAlerta alerta) {
        this.alerta = alerta;
    }
}
