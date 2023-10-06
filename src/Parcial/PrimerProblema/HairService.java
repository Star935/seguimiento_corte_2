package Parcial.PrimerProblema;

public enum HairService {
    HAIRCUT("Curly","This is our best haircut in our catalogue",24500){
        @Override
        public String showServiceDescription() {
            return "Name: " + getName() + ".\n" + "Description: " + getDescription() + ".\n" + "Price: " + getPrice()
                    + "." + "\n------------";}
    },

    NAILS("Galaxy","The most gorgeous color of the country in your nails",50000){
        @Override
        public String showServiceDescription() {
            return "Name: " + getName() + ".\n" + "Description: " + getDescription() + ".\n" + "Price: " + getPrice()
                    + "." + "\n------------";}
    },
    INK("Blue","The favorite one of the people",60000){
        @Override
        public String showServiceDescription() {
            return "Name: " + getName() + ".\n" + "Description: " + getDescription() + ".\n" + "Price: " + getPrice()
                    + "." + "\n------------";}
    };
    public String Name;
    public String Description;
    public Integer price;

    HairService(String name, String description, Integer price) {
        Name = name;
        Description = description;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public abstract String showServiceDescription();
}
