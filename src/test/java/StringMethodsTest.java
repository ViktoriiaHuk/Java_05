import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    // 1.1 Positive Test Space Delete
    @Test

    public void testRemoveSpacesDelete() {
        String line = "    Red Rover School  ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(line);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 1.2 Positive Test Not Space
    @Test

    public void testRemoveNotSpaces() {
        String line = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 1.3 Negative Test Line is null
    @Test

    public void testRemoveLineIsNull_NegativeTest() {
        String line = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2.1 Negative Test Line is null
    @Test

    public void testRemoveAllAsLineIsNull_NegativeTest() {
        String line = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2.2 Positive Test Line delete space
    @Test

    public void testRemoveAllAsLineDeleteSpace() {
        String line = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2.3 Positive Test Line delete a and space
    @Test

    public void testRemoveAllAsLineDeleteAAndSpace() {
        String line = "panda  ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2.4 Positive Test Line delete a
    @Test

    public void testRemoveAllAsLineDeleteA() {
        String line = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3.1 Positive Test Remove All Zeros
    @Test

    public void testRemoveAllZeros() {
        String line = "3504209706040000";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(line);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 3.2 Positive Test Remove All  Line is null
    @Test

    public void testRemoveAllZero_1() {
        String line = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(line);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 3.3 Negative Test Remove All  Line is null
    @Test

    public void testRemoveAllZeroLineIsNull_NegativeTest() {
        String line = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllZeros(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4.1. Positive Test Remove All  Spaces
    @Test

    public void testRemoveAllSpaces() {
        String line = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4.2. Positive Test Remove All  Spaces
    @Test

    public void testRemoveAllSpaces_2() {
        String line = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 5.1 Positive Test CountAs
    @Test

    public void testCountAs() {
        String line = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 5.2 Positive Test CountAs
    @Test

    public void testCountAsWithSpaceNotA() {
        String line = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }


    // 5.3 Positive Test CountAs
    @Test

    public void testCountAsWithNumber() {
        String line = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //6.1 Positive Test countJava
    @Test

     public void testcountJava_true(){
        String line = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current" +
                " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java " +
                "8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //6.2 Positive Test countJava
    @Test

    public void testcountJava_false(){
        String line = "99 little bugs in a code.\n" +
                "99 little bugs in a code.\n" +
                "Take one down, and patch it around.\n" +
                "235 critical bugs in the code.";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //7.1 Positive Test insertQuotes
    @Test

    public void testInsertQuotes(){
        String line = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(line);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //8.1 Positive Test insertQuotesTwoLine
    @Test

    public void insertQuotesTwoLine_Dostoevskyi(){
        String line1 = "Федор Достоевский писал";
        String line2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";
        String actualResult = new StringMethods().insertQuotesTwoLine(line1, line2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    //8.2 Positive Test insertQuotesTwoLine
    @Test

    public void insertQuotesTwoLine_Napoleon(){
        String line1 = "Наполеон Бонапарт писал";
        String line2 = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";
        String actualResult = new StringMethods().insertQuotesTwoLine(line1, line2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    // 9.1  Positive Test returnNameCity
    @Test

    public void testReturnNameCityLowerCase(){
        String line = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().returnNameCity(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 9.2  Positive Test returnNameCity
    @Test

    public void testReturnNameCityUpperCase(){
        String line = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().returnNameCity(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 10.1  Positive Test returnLineBetweenLetter
    @Test

    public void testReturnLineBetweenLetter_B(){
        String line = "Abracadabra";
        String letter = "b";
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().returnLineBetweenLetter(line, letter);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 10.2  Positive Test returnLineBetweenLetter_P
    @Test

    public void testReturnLineBetweenLetter_P(){
        String line = "Whippersnapper";
        String letter = "p";
        String expectedResult = "ppersnapp";
        String actualResult = new StringMethods().returnLineBetweenLetter(line, letter);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 11.1  Positive Test returnNameCity
    @Test

    public void testReturnLetterCheck_True(){
        String line = "Abracadabra";
        String letter = "a";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().returnLetterCheck(line,letter);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 11.2  Positive Test returnNameCity
    @Test

    public void testReturnLetterCheck_False(){
        String line = "Whippersnapper";
        String letter = "a";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().returnLetterCheck(line,letter);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //12.1 Positive test returnSplitLastWord
    @Test

    public void testReturnSplitLastWord(){

        String line = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().returnSplitLastWord(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    //12.2 Positive test returnSplitLastWord_Ukraine
    @Test

    public void testReturnSplitLastWord_Ukraine(){

        String line = "Правильно писать не НА Украине, а В Украине";
        String expectedResult = "Украине";
        String actualResult = new StringMethods().returnSplitLastWord(line);

        Assert.assertEquals(actualResult, expectedResult);

    }

    // 13.1 Positive test returnDeleteBetweenIndex
    @Test

    public void  testReturnDeleteBetweenIndex(){
        String line = "Red Rover";
        int index1  = 1;
        int index2 = 4;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().returnDeleteBetweenIndex(line,index1,index2);

        Assert.assertEquals(actualResult, expectedResult);


    }



}
