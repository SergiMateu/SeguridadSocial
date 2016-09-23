/**
 * Created by Sergi Mateu on 19/09/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }


// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {

        boolean repetida = false;

        for(Persona personaActual : personasList){

            if (personaActual.getDni().equals(persona.getDni()) || personaActual.getNumSS().equals(persona.getNumSS())){

                repetida = true;
                break;
            }

        }
        if(!repetida){
            personasList.add(persona);
        }


    }

    public void bajaPersona(String dni) {

        Persona aux = null;

        for(Persona personaActual : personasList){

            if(personaActual.getDni().equals(dni)){

                aux = personaActual;
                break;
            }
        }
        if(aux!=null){
            personasList.remove(aux);
        }

        personasList.removeIf(persona -> persona.getDni().equals(dni));

    }

    public Persona obtenerPersonaPorDNI(String dni) {

        for(Persona personaActual : personasList){

            if(personaActual.getDni().equals(dni)){

               return personaActual;
            }
        }

        return null;


    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        for(Persona personaActual : personasList){

            if(personaActual.getNumSS().equals(numSS)){

                return personaActual;
            }
        }

        return null;

    }

    public List<Persona>obtenerPersonasRangoSalarial(double min, double max) {

        List<Persona> aux = new ArrayList<>();
        for (Persona personaActual : personasList) {
            if (personaActual.getSalario() >= min && personaActual.getSalario() >= max) {
                aux.add(personaActual);
            }
        }
        return aux;
    }

    public List<Persona>obtenerPersonasMayoresQue(int edad){

            List<Persona> aux = new ArrayList<>();
            for(Persona personaActual : personasList){
                if(personaActual.getEdad()> edad){
                    aux.add(personaActual);
                }
            }
            return aux;
    }

    public List<Persona> obtenerTodas(){

    }

    @Override

    public String toString() {

        return "SeguridadSocial{" +

                "personasList=" + personasList +

               '}';

    }

}