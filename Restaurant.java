import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static List<Dish> menu = new ArrayList<>();

    public static void addDish(Dish dish) {
        menu.add(dish);
    }

    public static int getTotalDishes() {
        return menu.size();
    }


}