package lumarasports.repository;

import lumarasports.model.Equipo;

import java.util.List;

public interface EquipoRepository {

    public void save(Equipo equipo);

    public Equipo findById(Integer id);

    public List<Equipo> findAll();

    public void deleteById(Integer id);


}
