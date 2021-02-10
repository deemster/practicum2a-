public class Zwembad {
    double Breedte;
    double Lengte;
    double Diepte;
    double Inhoud;

    public Zwembad(){

    }
    public Zwembad(double breedte, double lengte, double diepte){
        this.Breedte = breedte;
        this.Lengte = lengte;
        this.Diepte = diepte;
    }
    public double getBreedte() {
        return Breedte;
    }
    public void setBreedte(double breed){

        this.Breedte = breed;
    }

    public double getLengte() {

        return Lengte;
    }

    public void setLengte(double lengte) {

        Lengte = lengte;
    }

    public double getDiepte() {

        return Diepte;
    }

    public void setDiepte(double diepte) {

        Diepte = diepte;
    }
    public double inhoud(){

        this.Inhoud = getBreedte() * getLengte() * getDiepte();
        return Inhoud;
    }
    public String toString(){
        String text = "Dit zwembad is " + Breedte + " meter breed, " + Lengte + " meter lang, en " + Diepte + " meter diep";
        return text;
    }

}

