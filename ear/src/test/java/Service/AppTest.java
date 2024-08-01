package Service;
import domain.Tea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.TeaService;
import services.TeaServiceImpl;


import java.util.ArrayList;
import java.util.List;

public class AppTest {
    List<Tea> teaList = new ArrayList<>();

    @DisplayName("Должен проверить позицию в списке")
    @Test
    public void shouldHaveCorrectMethodHasTea (){
        Tea tea = new Tea("Red", "Липтон");
        teaList.add(tea);
        TeaService teaService = new TeaServiceImpl(teaList);
        Assertions.assertTrue(teaService.hasTea("Red"));

    }

    @DisplayName("правильное добавление в список")
    @Test
    public void shouldHaveCorrectMethodPutTea(){
        Tea tea1 = new Tea("Black", "Австралийский");
        Tea tea2 = new Tea("Green", "Бельгийский");

        TeaService teaService = new TeaServiceImpl(teaList);
        teaService.putTea(tea2);
        Assertions.assertEquals(tea2, teaService.getTea());
    }

    @DisplayName("должен корректно находить позицию по названию и удалять позицию из списка")
    @Test
    public void shouldHaveCorrectMethodTakeTeaBy(){
        Tea tea1 = new Tea("Red", "Липтон");
        Tea tea2 =new Tea("Black", "Крымский");
        teaList.add(tea1);
        teaList.add(tea2);
        TeaService teaService = new TeaServiceImpl(teaList);
        Assertions.assertNotEquals(tea1, teaService.takeTeaByName("Red"));
        System.out.println(teaList.toString());

    }


}
