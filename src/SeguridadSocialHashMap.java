import java.util.HashMap;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashMap {
    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSS = new HashMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapSS.containsKey(persona.getNumSS())) {

            //relaciona la clave del dni con la persona (internamente)
            personaMapDni.put(persona.getDni(), persona);
            personaMapSS.put(persona.getNumSS(), persona);

        }
    }

public Persona obtenerPersonaPorDNI(String dni){

    //personaMapDni.keySet(); Coger todas las keys
    //personaMapDni.values(); Coger todas las values
    //personaMapDni.remove(dni);

    return personaMapDni.get(dni);
    }

}