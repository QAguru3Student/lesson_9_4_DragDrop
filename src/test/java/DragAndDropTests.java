import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test
    void dragAndDropTest(){
        //Открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //Перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo("#column-b");
        //Проверить, что прямоугольники действительно поменялись
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}

