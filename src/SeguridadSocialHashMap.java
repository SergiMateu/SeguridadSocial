import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public void bajaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni())) {

            personaMapDni.remove(persona.getDni(), persona);


        }
    }


public Persona obtenerPersonaPorDNI(String dni){

    //personaMapDni.keySet(); Coger todas las keys
    //personaMapDni.values(); Coger todas las values
    //personaMapDni.remove(dni);feggdgjjgdfjdfgfdgdjg


    return personaMapDni.get(dni);

    }

    public Persona obtenerPersonaPorNumSS(String numSS){


        return personaMapDni.get(numSS);

    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {

        List<Persona> aux = new ArrayList<>();
        for (Persona persona : personaMapDni.values()) {
            if (persona.getSalario() >= min && persona.getSalario() <= max) {
                aux.add(persona);
            }
        }
        return aux;
    }


    public List<Persona>obtenerPersonasMayoresQue(int edad){

        List<Persona> aux = new ArrayList<>();
        for(Persona persona : personaMapDni.values()) {
            if(persona.getEdad()> edad){
                aux.add(persona);
            }
        }
        return aux;
    }

    public List<Persona> obtenerTodas(){

        List<Persona> aux = new ArrayList<>();


        for(Persona persona : personaMapDni.values()){

            aux.add(persona);
        }

        return aux;

    }

}