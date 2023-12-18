package ocp.lukapopov.beyondclasses.nestedclasses.staticnestedclass;

public class State {
    static class Town{
        private int type = 1;
    }

    public static void main(String[] args) {
        Town town = new Town();//if not static: Town town = new State().new Town();
        System.out.println(town.type);
    }
}
