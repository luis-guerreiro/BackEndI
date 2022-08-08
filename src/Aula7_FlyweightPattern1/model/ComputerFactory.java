package Aula7_FlyweightPattern1.model;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String,Computer> macFlyweight = new HashMap<>();

    public Computer getComputer(int ram, int disco){
        String id = "id: "+ram+" : "+disco;
        System.out.println(id);

        if(!macFlyweight.containsKey(id)){//falso, se o Computer já existir
            macFlyweight.put(id,new Computer(ram,disco));
            System.out.println("\nPC Criado com sucesso");
            return macFlyweight.get(id);
        }
        System.out.println("\nPC obtido");
        return macFlyweight.get(id);
    }
}
