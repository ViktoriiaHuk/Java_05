public class StringMethods {

    /* Task 1.Написать метод removeSpaces(), который принимает на вход строку.
    Если строка не пустая (проверить методом класса String), то примените метод по удалению пробелов в начале и в конце
    строки.Догадаться, каким методом из видео можно проверить, были ли пробелы в строке.
    Если пробелы были, то метод должен удалить их и вернуть сообщение: “Лишние пробелы удалены”.
    Если пробелов не было, вернуть сообщение “Пробелов не было”.
    Если строка пустая (проверить методом класса String), вернуть сообщение “Строка пустая”. */

    public String removeSpaces(String line) {

        if (line.isEmpty() == false) {
            String notSpaceLine = line.trim();
            if (line.length() == notSpaceLine.length()) {

                return "Пробелов не было";

            } else {

                return "Лишние пробелы удалены";
            }

        } else {

            return "Строка пустая";
        }

    }

    /* Task 2. Написать алгоритм removeAllAs().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
    то метод удаляет все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.  */

    public String removeAllAs(String line) {
        if (line.isEmpty() == false) {
            String resultLine = line.trim().replaceAll("a", "");

            return resultLine;
        }

        return "Строка пустая";
    }

    /* Task3 Написать алгоритм removeAllZeros().
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр.
    Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную
    строку, в которой нет нулей. Если в строке не было нулей, метод возвращает сообщение “This is a valid string”.  */

    public String removeAllZeros(String line) {
        if (line.isEmpty() == false) {

            String resultLine = line.trim().replaceAll("0", "");

            if (line.trim() == resultLine) {

                return "This is a valid string";

            } else {

                return resultLine;
            }
        }

        return "Строка пустая";
    }
    /* Task 4 Написать алгоритм removeAllSpaces.
    С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная,
    то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку. */

    public String removeAllSpaces(String line) {
        if (line.isEmpty() == false) {

            String resultLine = line.trim().replaceAll(" ", "");

            return resultLine;
        }

        return "Строка пустая";
    }

    /* Task 5. Напишите метод countAs(), который принимает на вход строку и считает, сколько букв а или А содержится
    в строке. Метод возвращает количество букв a/A,  и количество букв/знаков в слове без букв a/A.
    Итоговый результат должен строится с помощью метода из видео 2.  */

    public String countAs(String line) {
        if (line.isEmpty() == false) {

            if (line.toLowerCase().contains("a") == true) {
                String lineNotA = removeAllAs(line.toLowerCase());
                int countA = line.length() - lineNotA.length();
                int countNotA = line.length() - countA;
                String count = "" + countA;
                String count1 = "" + countNotA;

                return count.concat(", ").concat(count1);

            } else {
                String count = "0";
                String count1 = "" + line.length();

                return count.concat(", ").concat(count1);

            }
        }
        return "Строка пустая";
    }

    /* Task 6. Напишите метод countJava(), который принимает на вход текст и проверяет, содержится ли в тексте
     хотя бы одно слово Java.  */

    public boolean countJava(String line) {
        if (line.toLowerCase().contains("java") == true) {

            return true;
        } else {

            return false;
        }
    }

    /* Task 7. Напишите метод insertQuotes(), который принимает слово и возвращает строку, в которой это
    слово “обернуто” в кавычки: */

    public String insertQuotes(String line) {
        if (line.isEmpty() == false) {
            String quotes = "\"";

            String result = quotes.concat(line).concat(quotes);

            return result;
        }
        return "Строка пустая";
    }

    /* Task 8. Напишите метод insertQuotes(), который принимает на вход две строки, и добавляет знак :  после
     слова “писал”,  и оборачивает в кавычки вторую строку (результат строится с помощью метода concat())*/

    public String insertQuotesTwoLine(String line1, String line2) {
        if (line1.isEmpty() == false || line2.isEmpty() == false) {
            String quotes = "\"";
            String colon = ": ";

            String result = line1.concat(colon).concat(quotes).concat(line2).concat(quotes);

            return result.replace("«", "\"").replace("»", "\"");
        }
        return "Строка пустая";
    }

    /* Task 9. Напишите метод, кторый принимает на вход название города и исправляет написание: */

    public String returnNameCity(String line) {
        if (line.isEmpty() == false) {
            String result = line.substring(0, 1).toUpperCase() + line.substring(1).toLowerCase();

            return result;
        }
        return "Строка пустая";
    }

    /*  Task 10. Напишите метод, который принимает на вход строку и букву-параметр, и возвращает все, что находится
    между первой и последней буквой-параметром:   */

    public String returnLineBetweenLetter(String line, String letter) {
        if (line.isEmpty() == false) {

            int start = line.toLowerCase().indexOf(letter);
            int finish = line.lastIndexOf(letter);
            String result = line.substring(start, finish + 1);
            return result;
        }
        return "Строка пустая";
    }


    /* Task 11. Напишите метод, который принимает на вход слово, и возвращает true, если слово начинается и
    заканчивается на одинаковую букву, и false иначе   */

    public boolean returnLetterCheck(String line, String letter) {
        if (line.toLowerCase().indexOf(letter) == 0 && line.toLowerCase().lastIndexOf(letter) == line.length() - 1) {

            return true;
        } else {

            return false;
        }
    }
    /* Task 12.Напишите метод, который принимает на вход строку из двух слов, разделенных пробелом, и возвращает
    последнее слово  */

    public String returnSplitLastWord(String line) {
        if (line.isEmpty() == false) {
            String[] result = line.split(" ");
            for (int i = 0; i < result.length; i++) {
                if (i == result.length - 1) {
                    return result[i];
                }
            }
        }
        return "Строка пустая";
    }

    /* Task 13. Написать метод, который принимает строку, и 2 индекса. Метод удаляет все, что находится между
    двумя индексами включительно   */

    public String returnDeleteBetweenIndex(String line, int index1, int index2) {
        if (line.isEmpty() == false) {
            String result  = line.substring(0, index1 - 1) + line.substring(index2 );
                    return result;
                }

        return "Строка пустая";
    }

    /* Task 14. Напишите метод, который принимает на вход предложение и возвращает слова из этого предложения
    в виде массива слов  */

    /* Task 15. Написать метод, который принимает на вход предложение, которое состоит из имени, фамилии,
     отчества и возвращает текст:   */

    /* Task 16.  Написать метод, который принимает на вход слово и число n,  и возвращает строку, где слово
     повторяется n раз.   */

    /* Task 17. Напишите метод, который принимает строку и index, и возвращает численное значение буквы, которая
     находится на позиции index (использовать только один метод класса String)  */

    /* Task 18. Написать метод, который принимает 3 слова, и сравнивает их методом, который считает, что прописные
     и заглавные буквы - это одни и те же буквы. Метод возвращает true, если все слова одинаковы, и метод возвращает
      false, если слова не одинаковы:  */


}
