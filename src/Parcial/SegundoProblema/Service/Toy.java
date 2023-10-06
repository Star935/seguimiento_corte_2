package Parcial.SegundoProblema.Service;

import Parcial.SegundoProblema.Dto.Toys_Dto;
import Parcial.SegundoProblema.Interface.Local_Interface;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Toy implements Local_Interface {
    private List<Toys_Dto> Toys;

    public Toy() throws IOException, ClassNotFoundException {
        Toys = new ArrayList<>();
    }

    @Override
    public Toys_Dto findById(int id) {
        return Toys.stream()
                .filter(Toy -> Toy.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Toys_Dto> findAll() throws IOException, ClassNotFoundException {
        Toys = (List<Toys_Dto>) Parcial.SegundoProblema.Service.ObjectSerializer.readObjectFromFile("juguetes.ax");
        return Toys;
    }

    @Override
    public void save(Toys_Dto Toy) throws IOException {
        Toys.add(Toy);
        Parcial.SegundoProblema.Service.ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
    }

    @Override
    public void update(Toys_Dto Toy) throws IOException {
        Toys_Dto oldProducto = findById(Toy.getId());
        if (oldProducto != null) {
            Toys.remove(oldProducto);
            Toys.add(Toy);
            Parcial.SegundoProblema.Service.ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
        }
    }

    @Override
    public void delete(Toys_Dto Toy) throws IOException {
        Toys.remove(Toy);
        ObjectSerializer.writeObjectToFile(Toys, "juguetes.ax");
    }
}
