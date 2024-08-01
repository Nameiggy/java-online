package services;

import domain.Tea;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class TeaServiceImpl implements TeaService{
    private  final List<Tea> teasFromStore;






    public Tea takeTeaByName(String name) {
        Tea resTea = null;
        for (Tea tea :teasFromStore ) {
            if (tea.getColor().equals(name)){
                resTea= tea;
            }

        }
        if (resTea != null) {
            teasFromStore.remove(resTea);
            return resTea;
        }

        return null;
    }

    public void putTea(Tea tea) {
        teasFromStore.add(tea);

    }

    public boolean hasTea(String name) {
        for (Tea tea : teasFromStore){
            if (tea.getColor().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getTea() {
        for (Tea tea: teasFromStore){
            System.out.println(tea.getColor()+ "  " + tea.getAuthor());
        }

        return 0;
    }
}
