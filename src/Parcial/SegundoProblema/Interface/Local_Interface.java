package Parcial.SegundoProblema.Interface;

import Parcial.SegundoProblema.Dto.Toys_Dto;
import java.io.IOException;
import java.util.List;
public interface Local_Interface {
    Toys_Dto findById(int id);
    List<Toys_Dto> findAll() throws IOException, ClassNotFoundException;
    void save(Toys_Dto toys) throws IOException;
    void update(Toys_Dto toys) throws IOException;
    void delete(Toys_Dto toys) throws IOException;
}
