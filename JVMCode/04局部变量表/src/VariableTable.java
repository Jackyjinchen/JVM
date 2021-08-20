/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/8/20
 * @Content:
 */
public class VariableTable {

    public static void main(String[] args) {
        VariableTable variableTable = new VariableTable();
        variableTable.myTest();
        variableTable.useTest2();
        return;
    }

    public void myTest() {
        return;
    }

    public int test2() {
        int a = 0;
        {
            int b = 1;
            b = a + 1;
        }
        int c = a + 1;
        return c;
    }

    public void useTest2() {
        int i = test2();
        int j = i;
    }

    public void add() {
        int i1 = 10;
        i1++;

        int i2 = 10;
        ++i2;

        int i3 = 10;
        int i4 = i3++;

        int i5 = 10;
        int i6 = ++i5;

        int i7 = 10;
        i7 = i7++;

        int i8 = 10;
        i8 = ++i8;

        int i9 = 10;
        i9 = i9++ + ++i9;

        System.out.println(i1+i2+i3+i4+i5+i6+i7+i8+i9);
    }


}
