public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
        };

        try {
            System.out.println(arrSumm(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("В ячейке "+e.getI()+" "+e.getJ()+" лежит неверное значение \""+e.getValue()+"\" суммирование невозможно!");
        }

    }

    public static int arrSumm(String[][] array) throws MyArraySizeException,MyArrayDataException {
        int summArray = 0;
        if(array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        } else {
            for (int i = 0; i < array.length; i++) {
                if(array[i].length != 4) {
                    throw new MyArraySizeException("Неверный размер массива");
                } else {
                    for (int j = 0; j < array[i].length; j++) {
                        int number;
                        try {
                            number = Integer.parseInt(array[i][j]);

                        } catch (NumberFormatException e) {
                            throw new MyArrayDataException("Неверное значение ячейки "+i+" "+j, i, j, array[i][j]);
                        }
                        summArray += number;
                    }
                }
            }
        }

        return summArray;
    }
}
