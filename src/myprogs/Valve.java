package myprogs;

class Add {
    int x, y;

    Add(int i, int j) {
        x = i;
        y = j;
    }
}

class Value {
    public static void main(String[] args) {
        Add add = new Add(5, 10);
        change(add.x, add.y);
        changed(add);
        System.out.println("x = " + add.x);
        System.out.println("y = " + add.y);
    }

    public static void change(int x, int y) {
        x++;
        y++;
    }

    public static void changed(Add add) {
        add.x++;
        add.y++;
    }
}
