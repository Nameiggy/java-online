package services;

import domain.Tea;

public interface TeaService {
    Tea takeTeaByName(String name);

    void putTea (Tea tea);

    boolean hasTea(String name);
    int getTea();
}
