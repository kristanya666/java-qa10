import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTestThree {
    String filmItem1 = new String("Бладшот");
    String filmItem2 = new String("Вперёд!");
    String filmItem3 = new String("Отель Белград");
    String filmItem4 = new String("Джентльмены");
    String filmItem5 = new String("Человек-невидимка");
    String filmItem6 = new String("Тролли");
    String filmItem7 = new String("Номер один");
    String filmItem8 = new String("Бойцовский клуб");
    String filmItem9 = new String("Анна");
    String filmItem10 = new String("Маугли");


    AfishaManager afishaManager = new AfishaManager(11);


    @Test
    public void shouldSave() {


        afishaManager.save(filmItem1);
        afishaManager.save(filmItem2);
        afishaManager.save(filmItem3);
        afishaManager.save(filmItem4);
        afishaManager.save(filmItem5);
        afishaManager.save(filmItem6);
        afishaManager.save(filmItem7);
        afishaManager.save(filmItem8);
        afishaManager.save(filmItem9);
        afishaManager.save(filmItem10);


        String[] expected = {filmItem1, filmItem2, filmItem3, filmItem4, filmItem5, filmItem6, filmItem7, filmItem8, filmItem9, filmItem10};
        String[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilmList() {

        shouldSave();

        String[] expected = {filmItem1, filmItem2, filmItem3, filmItem4, filmItem5, filmItem6, filmItem7, filmItem8, filmItem9, filmItem10};
        String[] actual = afishaManager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldShowReverse() {

        shouldSave();

        String[] expected = {filmItem10, filmItem9, filmItem8, filmItem7, filmItem6, filmItem5, filmItem4, filmItem3, filmItem2, filmItem1};
        String[] actual = afishaManager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
