
package com.portfolio.wgr.Interface;

import com.portfolio.wgr.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer
    public List<Persona> getPersona();
    //Guardar
    public void savePersona(Persona persona);
    //Eliminar
    public void deletePersona(Long id);
    //Buscar
    public Persona findPersona(Long id);
    
}
