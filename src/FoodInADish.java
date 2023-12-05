import javax.swing.*;

public abstract class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    T food;
    String dishColor;
    FoodInADish<> (){

    }
    @Override
    public int compareTo(FoodInADish o)
    {
        if(food instanceof Fruit && o.getFood() instanceof Vegetable){return 1;}
        else if (food instanceof Vegetable && o.getFood() instanceof Fruit){return -1;}
        else if (((int)(((Food)food).getKg())-(int)(((Food)o.getFood()).getKg()))!=0){return ((int)(((Food)food).getKg())-(int)(((Food)o.getFood()).getKg()));}
        else if(food instanceof Fruit )
        {
            if(((Fruit)food).getIsReadyToEat() ==true && ((Fruit)o.getFood()).getIsReadyToEat() == false)
            {
                return 1;
            }
            if(((Fruit)food).getIsReadyToEat()==false && ((Fruit)o.getFood()).getIsReadyToEat() == true)
            {
                return -1;
            }

            else{return 0;}

        }
        else
        {
            if(((Vegetable)food).getIsFresh()==true && ((Vegetable)o.getFood()).getIsFresh() == false)
            {
                return 1;
            }
            if(((Vegetable)food).getIsFresh()==false && ((Vegetable)o.getFood()).getIsFresh() == true)
            {
                return -1;
            }

            else{return 0;}

        }

    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }

    public JPanel draw(){
        ImageIcon foodIcon= new ImageIcon("/resources"+((Food)food).getName()+".png");
        ImageIcon dishIcon = new ImageIcon("/resources"+dishColor+".png");
        JPanel p = new JPanel();
        JLabel fl = new JLabel(foodIcon);

        p.add(fl);
        return p;
    }
}
